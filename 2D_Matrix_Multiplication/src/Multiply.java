//Matrix multiplication will only work when column of 1st matrix is equal to the row of another matrix.
import java.util.*;
public class Multiply 
{

	public static void main(String[] args) 
	{
		int arr[][],r[][],sum=0;
		int arr2[][]= {{4,5},{6,7},{8,9}};
		Scanner input=new Scanner(System.in);
		arr=new int[2][3];
		r=new int[2][2];
		System.out.println("Enter element of first matrix:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=input.nextInt();
			}
		}
//		System.out.println("Enter second Matrix Element: ");
//		for(int i=0;i<arr2.length;i++)
//		{
//			for(int j=0;j<arr2.length;j++)
//			{
//				arr2[i][j]=input.nextInt();
//			}
//		}
		System.out.println("Enter 1st Matrix Element: ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j] +" ");
			}
			  System.out.println();
		}
		System.out.println("Enter 2nd Matrix Element: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr2[i][j] +" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<r.length;i++)
		{
			for(int j=0;j<r.length;j++) 
			{
				for(int k=0;k<3;k++)
				{
					sum=sum+arr[i][k]*arr2[k][j];
				}
				 r[i][j]=sum;
				 sum=0;
			}
		}
		System.out.println("Resultant Matrix is: ");
		for(int i=0;i<r.length;i++)
		{
			for(int j=0;j<r.length;j++)
			{
				System.out.print(r[i][j] + " ");
			}
			 System.out.println();
		}
        input.close();			
		

	}

}
