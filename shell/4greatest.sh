echo ENTER 3 number 
read a
read b
read c
s=$a
if [ $b -gt $s ]
then
s=$b
fi
if [ $c -gt $s ]
then
s =$c
fi
echo Lrgest of $a $b $c is $s 
