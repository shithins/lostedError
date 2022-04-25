<html>
<body bgcolor='#cfe5e6'>
<h2>Array Operations</h2>
<form action="" method="post">
<input type=radio name=arr value=dis>Display Array<br>
<input type=radio name=arr value=srt>Sorted Array<br>
<input type=radio name=arr value=usrt>Without Duplicate<br>
<input type=radio name=arr value=pop>Delete Last<br>
<input type=radio name=arr value=rev>Array Reverse<br>
<input type=radio name=arr value=sear>Array Search<br>
<input type=Submit><br>
</body>
</html>
<?php
$names=array("jishana","abhay","harold","maxwell","viyanak","jonhs","jithin","Akhil","swathi","kavya");
if($_POST)
{
$val=$_POST['arr'];
switch($val)
{
case "dis" : echo "<h2>Display Array</h2>";
foreach($names as $value)
echo "<br>".$value;
break;
case "srt" : echo "<h2>Sorted Array</h2>";
sort($names);
foreach($names as $value)
echo "<br>".$value;
break;
case "usrt": echo "<h2>List unique Array elements</h2>";
$uarray=array_unique($names);
foreach($uarray as $value)
echo "<br>".$value;
break;
case "pop" : echo "<h2>Delete last element</h2>";



array_pop($names);
foreach($names as $value)
echo "<br>".$value;
break;
case "rev" : echo "<h2>Reverse Array</h2>";
$revarr=array_reverse($names);
foreach($revarr as $value)
echo "<br>".$value;
break;
case "sear": echo "<h2>Search Array element</h2>";
echo "<br>Element deleted at index".array_search("Jhon",$names,true);
break;
}
}
?>