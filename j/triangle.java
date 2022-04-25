
import java.util.*;
class Triangle{
	public static void main(String args []){
	
	float a=0.f;
	float b=0.f;
	float c=0.f;
	float h=0.f;
	float s=0.f;
	float base=0.f;
	double area;
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("enter three sides of the traingle:");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	
	System.out.println("enter  height of the traingle:");
	h=sc.nextInt();
	
	if (a==b){
		base = a;
	}
	else if (b==c){
		base = b;
	}
	else if (a==c){
		base=c;
	}
	
	if ( a==b && b==c && a==c){
		System.out.println("equilateral");
		area = (Math.sqrt(3)/4)*(a*a);
		System.out.println("area is :"+ area);
	}
	
	else if (((a==b)&& ((a!=c) && (b!=c))) || ((a==c) && ((a!=b) && (c!=b)))  || ((b==c) && ((b!=a)&& (c!=a)))){
	
	System.out.println("isosceles");
	area = (base * h)/2;
	System.out.println("area is :"+ area);
	}
	
	
	else if (a!=b && b!=c && a!=c){
	
	System.out.println("scalene");;
	
	s=(a+b+c)/2;
	
	area = Math.sqrt (s* ((s-a)*(s-b)*(s-c)));
	System.out.println("area is :"+ area);
	
	}
	
	}
}
