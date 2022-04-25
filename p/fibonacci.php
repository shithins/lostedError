<html>
    <body>
        <form action="" method="post">
            enter limit: <input type="text" name ='limit'/><br>
            <input type="submit" value='fib'/> <br>

        </form>
    </body>
</html>

<?php
if ($_POST){
    $n = $_POST['limit'];
    $a = 0;
    $b = 1;
    echo "$a <br>";
    echo "$b <br>";
    while ($a<=$n){
       $c = $a+$b;
       echo "$c <br>";
       $a=$b;
       $b=$c;

    }
}

?>

