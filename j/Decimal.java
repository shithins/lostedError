import java.util.*;
class Convert {
    Scanner sc = new Scanner(System.in);
    int num;
    void getVal() {
        System.out.println("decimal to hexadecimal,octal,binary");
        System.out.println("enter a number");
        num = Integer.parseInt(sc.nextLine());
    }

    void convert(){
        String hx = Integer.toHexString(num);
        String oc = Integer.toOctalString(num);
        String bn = Integer.toBinaryString(num);
        System.out.println("hexa decimal value is"+hx);
        System.out.println("octal value is "+ oc);
        System.out.println("binary value is "+ bn);

    }
}

class Decimal{
    public static void main(String[] args){
        Convert c = new Convert();
        c.getVal();
        c.convert();
    }
}