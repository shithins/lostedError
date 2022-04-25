import java.util.*;
class Rev{
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 int num = 0;
 int tempOne = 0 ;
 int tempTwo = 0;
 int sum = 0;
 Reverse obj =new Reverse ();
 System.out.print("enter the number");
 num =sc.nextInt();
  System.out.print("reverse is ");
  while(num>0){
  int rem = num % 10;
  obj.reverse(rem);
  sum+=rem;
  num/=10;
  
  
  }
   System.out.println("\n	sum is "+sum);
}
}
class Reverse{
int num;
void reverse(int rem){
num=rem;
 System.out.print(num);
}

}
