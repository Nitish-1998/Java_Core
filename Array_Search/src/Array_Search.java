import java.util.*;
public class Array_Search 
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
	       System.out.println("Enter Element u want to Search:");
	       int s=input.nextInt();
	       for(int i=0;i<a.length;i++)
	       {
	    	  if(a[i]==s)
	    	  {
	    		  System.out.println(a[i]+" Element on Position: "+ ++i);//++i is because the every array is start with 0 so it can be increment on the time of print; 
	    		  break;
	    	  }
	    	   
	       }


	}

}
