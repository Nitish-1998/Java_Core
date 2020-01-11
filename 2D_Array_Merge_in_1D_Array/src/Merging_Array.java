import java.util.*;
public class Merging_Array 
{
	public static void main(String[] args) 
	{
		int arr[][],arr2[][],b[],r2,c2;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Row:");
		int r=input.nextInt();
		System.out.println("Enter Column:");
		int c=input.nextInt();
		System.out.println("Enter Second Row:");
		r2=input.nextInt();
		System.out.println("Enter Second Column:");
		c2=input.nextInt();
		int size=r*c+r2*c2;
        arr =new int[r][c];
        arr2 =new int[r2][c2];
        b=new int[size];
        System.out.println("Elements Are 1st 2D Array: ");
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=0;j<arr[i].length;j++)
        	{
        		arr[i][j]=input.nextInt();
        	}
        }
        System.out.println("Elements Are 2nd 2D Array: ");
        for(int i=0;i<arr2.length;i++)
        {
        	for(int j=0;j<arr2[i].length;j++)
        	{
        		arr2[i][j]=input.nextInt();
        	}
        }
        System.out.println("1st 2D Matrix: ");
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=0;j<arr[i].length;j++)
        	{
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
        
        System.out.println();
        System.out.println("2nd 2D Matrix: ");
        for(int i=0;i<arr2.length;i++)
        {
        	for(int j=0;j<arr2[i].length;j++)
        	{
        		System.out.print(arr2[i][j]+" ");
        	}
        	System.out.println();
        }      
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=0;j<arr[i].length;j++)
        	{
        		b[k]=arr[i][j];
        		k++;
        	}
    	    
        }     
        for(int i=0;i<arr2.length;i++)
        {
        	for(int j=0;j<arr2[i].length;j++)
        	{
        		b[k]=arr2[i][j];
        		k++;
        	}
	    }
        System.out.println("Element of 1D Array are:");
        for(int i=0;i<b.length;i++)
        {
        	System.out.print(b[i]+" ");
        }
        input.close();
      
  }
	
}


