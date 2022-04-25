clear
time=$(date +"%H")
if [ $time -lt 12 ]
then
echo Good morning
elif [ $time -lt 15 ]
then
echo Good afternoon
elif [ $time -lt 20 ]
then
echo Good evening
else
echo Good night
fi
