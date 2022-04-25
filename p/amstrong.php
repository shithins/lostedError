<HTML>
    <body>
        <h1>amtrong or not </h1>
        <form action="" method="post">
            enter the number:<input type="text" name ="number"/>
            <input type="submit">
        </form>

    </body>
</HTML>

<?php

if($_POST){
    $number = $_POST['number'];
    $temp = $number;
    $sum = 0;
    while ($temp!=0){
        $num=$temp%10;
        $sum = $sum+($num*$num*$num);
        $temp=$temp/10;
    }

if ($number==$sum){
    echo "given number is amtrong";
}
else{
    echo " not amtrong";
}
}
?>