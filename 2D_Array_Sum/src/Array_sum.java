import java.util.*; 
public class Array_sum 
{

	public static void main(String[] args) 
	{
		int arr[][];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter elements row:");
        int r=input.nextInt();
        System.out.println("Enter elements columns:");
        int c=input.nextInt();
        arr=new int[r][c];
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=0;j<arr.length;j++)
        	{
        		arr[i][j]=input.nextInt();
        	}
        }System.out.println("2D Array Element are:");
         int sum=0;
	    for(int i=0;i<arr.length;i++)
     {
    	for(int j=0;j<arr[i].length;j++)
    	{
    	  sum=sum+arr[i][j];
    	}
     } 
	    System.out.println("Sum of 2D Array:"+sum);
   }
}
