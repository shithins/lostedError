
echo "enter radius of circle"
read r
area=$(echo "3.14 * $r * $r" |bc)
circu=$(echo "3.14*2*$r" |bc)
echo "the radius of circle is...." $r
echo "area of the circle is" $area
echo "circumference of circle is" $circu
