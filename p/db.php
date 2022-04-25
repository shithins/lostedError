<html>
    <body>
        <form action="" method='POST'>
            username: <input type="text" name ='usr'> <br><br>
            password: <input type="password" name='pass'><br><br>
            <input type="submit" value='login'>
        </form>
    </body>
</html>
<?php
if($_POST){
     $usr1=$_POST['usr'];
     $pswd=$_POST['pass'];
    $con=pg_connect("host=localhost dbname=db port=5431 user=postgres  password=root");
    // if($con){
    //     echo "con ok";
    // }
    // else{
    //     echo "connect failed";
    // }
    if($con){
        $qry="select username,password from login where username='$usr1' and password='$pswd' ";
         $result=pg_query($con,$qry);
         $nos=pg_num_rows($result);
        if($nos)
             echo "$usr1, u r logged successfully";
        
        else
         echo "login denied";      
          
     }
}

?>