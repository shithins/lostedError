import java.util.*;
class Conversion{
public static void main(String[] args){
Scanner sc = new Scanner (System.in);
double inch;
double meter;
double kilometre;
double cm ;
	 System.out.println("enter centimeter to convert:");
	 cm=sc.nextDouble();
	 
	 inch = cm/2.54;
	 meter = cm/100;
	 kilometre = cm/10000;
	 
	 
	 System.out.println("centimeter->inch"+inch);
	 System.out.println("entimeter->inch"+meter);
	 System.out.println("eentimeter->inch"+kilometre);
	 
}
}
