<html>
<head>
<title>Marklist</title>
</head>
<body>
<h3><center>Marksheet</center></h3>
<form method="POST" action="">
Regno:<input type="text" name="reg"/><br><br><br>
<input type="submit" value="show">
</form>
</body>
</html>
<?php
if($_POST)
{
$rg=$_POST['reg'];
$con =pg_connect("host=localhost dbname=college user=postgres password=root");
if($con)
echo "Successfully Connected...";
$qry="select * from stud where rollno=$rg";
$result=pg_query($con,$qry);
$nos=pg_num_rows($result);
while($row=pg_fetch_row($result))
{
echo "<br>\n";
echo "rollno: $row[0] <br> name: $row[1] <br> mark: $row[2] <br> grade: $row[3]";
}
}
?>