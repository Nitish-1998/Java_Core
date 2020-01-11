import java.util.*;
public class jagged_array 
{
   public static void main(String[] args)
   {Scanner input=new Scanner(System.in);
    System.out.println("Enter no.of rows: ");
    int r=input.nextInt();
    int arr[][]=new int[r][];
    //int c;
    for(int i=0;i<arr.length;i++)
    {
    	System.out.println("Enter columns: ");
    	int c=input.nextInt();
    	arr[i]=new int[c];
     
       //
	  
		   
	 }
    System.out.println("Elements are: ");
    for(int i=0;i<arr.length;i++) 
	   {
		   for(int j=0;j<arr[i].length;j++)
		   {
			   arr[i][j]=input.nextInt();
		   }
     }
    for(int i=0;i<arr.length;i++) 
	   {
		   for(int j=0;j<arr[i].length;j++)
		   {
			   System.out.print(arr[i][j]+" ");
		   }
  }
       input.close();
   }
    
}
