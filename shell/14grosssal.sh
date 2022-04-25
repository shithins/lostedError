echo "Enter your basic salary"
read basic
da=$((($basic * 40) /100))
#echo $da
hra=$((($basic * 20) /100))
#echo $hra
gross=$(($basic+$da+$hra))
echo Your basic salary = $basic
echo Your dearness allowance =$da
echo Your house rent allowance=$hra
echo Your net salary is = $gross
