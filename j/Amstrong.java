import java.util.Scanner;

class Amstrong {
	 public static void main (String [] args ){
	 int num1;
	 int num2;	 
	 Scanner sc = new Scanner (System.in);
	 System.out.println("enter the first no");
	 num1 = sc.nextInt();
	 System.out.println("enter the  2nd num");
	 num2 = sc.nextInt();	 
	 for (int i =num1;i< num2;i++){ 
 int temp1,temp2,rem,sum=0;
 temp1=i;
 temp2=i;
	 while(temp2>0){
	 rem=temp2	%10;
	 sum=sum+(rem*rem*rem);
	 temp2=temp2/10;	 
	 }
	 if (sum== temp1 ){
	 System.out.println(i);
	 }	 
	 }
	 
	 }
}
