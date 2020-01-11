import java.util.*;
public class Conversion_Array 
{

	public static void main(String[] args) 
	{
		int arr[][],b[];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Row:");
		int r=input.nextInt();
		System.out.println("Enter Column:");
		int c=input.nextInt();
		int size=r*c;
        arr =new int[r][c];
        b=new int[size];
        System.out.println("Elements Are");
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=0;j<arr.length;j++)
        	{
        		arr[i][j]=input.nextInt();
        	}
        }
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=0;j<arr[i].length;j++)
        	{
        		b[k]=arr[i][j];
        		k++;
        	}
        }System.out.println("Element of 1D Array are:");
        for(int i=0;i<b.length;i++)
        {
        	System.out.println(b[i]);
        }
        input.close();
	}

}
