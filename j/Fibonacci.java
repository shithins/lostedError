import java.util.*;
class Fibonacci{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int number = 0 ;
	int a = 0;
	int b = 1;
	int c =0;
	
	System.out.println("enter a number");
	number = sc.nextInt();
	System.out.println("fibanacci series is:");
	System.out.println(a);
	System.out.println(b);
	for (int i = 1 ; i <number;i++){
	c =a+b;
	System.out.println(c);
	a=b;
	b=c;
	
	
	
	}
	}
}
