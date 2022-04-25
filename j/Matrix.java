import java.util.*;
class Matrix{
public static void main(String	 args[]){
 Scanner sc = new Scanner(System.in);
 
 int arr[][] = new int [10][10];
 int row=0;
 int col=0;
 int i=0;
 int j=0;
 int trace=0;
  	System.out.println("enter row and col");
  	row = sc.nextInt();
 	col = sc.nextInt();
 System.out.println("enter the elements");
		for (i = 0;i<row;i++){
		for (j = 0;j<col;j++){
		arr[i][j] = sc.nextInt();
		
		
		}
 }
 System.out.println(" matrix is");
  
	for (i = 0;i<row;i++){
		for (j = 0;j<col;j++){
		System.out.print(arr[i][j]+" ");
		
		
		}
		System.out.println("\n");
 }
 
 
for (i=0,j=0;i<row && j<col;i++,j++){
 trace+=arr[i][j];
 
 }
 System.out.println("trace  is;"+trace);
 System.out.println("transpose is");
 
for (i = 0;i<col;i++){
		for (j= 0;j<row;j++){
		System.out.print(arr[j][i]+" ");
		
		
		}
		System.out.println("\n");
 
 }

 
 
 }
 }
 
