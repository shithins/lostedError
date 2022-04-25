import java.util.*;

public class VowelRemove {
    public static void main(String[] args){
        String strOne;
        String strTwo;
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a string");
        strOne = sc.nextLine();
        strTwo = strOne.replaceAll("[AEIOUaeiou]"," ");
        System.out.println("all vowels are removed");
        System.out.println(strTwo);



    }
}
