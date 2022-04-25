import java.util.*;
class Merge{
	public static void main(String args []){
	Scanner sc = new Scanner(System.in);
	int arrOne[] = new int [100];
	int arrTwo[] = new int [100];
	int oneLen=0;
	int twoLen =0;
	int i,j;
	
	System.out.println("enter  first array size");
	oneLen = sc.nextInt();
		System.out.println("enter first array elements");
		for (i = 0;i<oneLen;i++){
		arrOne[i] = sc.nextInt();	
		}
	System.out.println("enter  second array size");
	twoLen = sc.nextInt();
		System.out.println("enter second array elements");
		for (i = 0;i<twoLen;i++){
		arrTwo[i] = sc.nextInt();	
		}
	
	
	System.out.println("merged array is:");
	
	for (i=oneLen,j=0;j<twoLen;i++,j++){
	arrOne[i]=arrTwo[j];
	
	
	}
	
		for (i = 0;i<oneLen+twoLen;i++){
		System.out.print(arrOne[i]+" ");
		}
	
	System.out.print("\n");
	}
}
