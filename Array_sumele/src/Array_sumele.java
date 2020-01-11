import java.util.*;
public class Array_sumele 
{

	public static void main(String[] args) 
	{
		int a[];
	       Scanner input = new Scanner(System.in);
	       System.out.println("Enter Size of Array: ");
	       int n=input.nextInt();
	       a=new int[n];
	       for(int i=0;i<a.length;i++)
	       {
	    	   System.out.println("Enter Element in Array: ");
	    	   a[i]=input.nextInt();
	       }
	       int sum=0;
	       for(int i=0;i<a.length;i++)
	       {
	    	   sum=sum+a[i];
	       }
	        System.out.println("Sum of elements are: "+sum);
	         input.close();

	}

}
