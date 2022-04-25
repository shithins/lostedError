echo "enter first number"
read a
echo "enter second number"
read b
echo " enter third number"
read c
m=$(( ( $a + $b + $c) / 3))
p=`expr $a - $m`
q=`expr $b - $m`
r=`expr $c - $m`
d=$(( ( $p * $p + $q * $q + $r * $r) / 3 ))
w=$(echo "sqrt ( $d )" | bc)
echo "Mean of $a, $b, $c is $m"
echo "Standard deviation is $w"
