import java.util.*;
class LarSmall{
 public static void main(String	 args[]){
 
 	Scanner sc = new Scanner(System.in);
	int arr[] = new int [100];
	int big;
	int small;
	int nextBig;
	int i;
	int n;
	
	System.out.println("enter size");
	n = sc.nextInt();
		System.out.println("enter the elements");
		for (i = 0;i<n;i++){
		arr[i] = sc.nextInt();
		
		
		}
	big =arr[0];
	small =arr[0];
	nextBig=arr[0];
	
	for (i = 0;i<n;i++){
	if (big <arr[i]){
	big =arr[i];
	}
	else if (small > arr[i]){
	small = arr[i];
	
	}
	}
 
 	System.out.println("big is:"+big);
 	System.out.println("small is:"+small);
 	
 	for (i = 0;i<=n;i++){
 	if (nextBig <arr[i]){
 	
 	if (arr[i] == big ){
 	continue;
 	}
 	else{
 	
 	nextBig=arr[i];
 	}
 	
 	}
 
 }
 System.out.println("next big is:"+nextBig);
 
 
 
 }
}
