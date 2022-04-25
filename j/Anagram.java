import java.util.*;
class Anagram{
  public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the string");
    char arrOne[] = sc.next().toCharArray();
    
    for (int i =0;i<arrOne.length;i++){
      System.out.println(arrOne[i]);
    }
    System.out.println("enter the next string to check");
    char arrTwo[] = sc.next().toCharArray();
    
    for (int i =0;i<arrTwo.length;i++){
      System.out.println(arrTwo[i]);
    }
      
    int oneLen=arrOne.length;
    int twoLen=arrTwo.length;
    int flag=0;
    if (oneLen == twoLen){
    for (int i = 0;i<arrOne.length;i++){
      for (int j=0;j<arrTwo.length;j++){
        if(arrOne[i] == arrTwo[j]){
          System.out.print("string is anagram");
          flag=1;
         } 
          else {
            break;
        }
      }
    }
    if(flag == 0){
      System.out.println("not anagram");
    }
  }
  else{
    System.out.println("not anagram ");
  }
  }
}