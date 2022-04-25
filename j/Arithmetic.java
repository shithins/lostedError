import java.util.*;
class Arithmetic{
public static void main(String args[]){

int first,second, add,sub,mult,rem;
float divide;

Scanner sc = new Scanner (System.in);
first = Integer.parseInt(args[0]);
second = Integer.parseInt(args[1]);

add = first + second;
sub = first- second;
mult = first * second;
rem=first%second;
divide =(float) first / second;



System.out.println("sum"+add);
System.out.println("sum"+sub);
System.out.println("sum"+mult);
System.out.println("sum"+divide);
System.out.println("sum"+rem);

}
}
