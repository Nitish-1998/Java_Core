import java.util.*;
public class Element_Enter 
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
       for(int i=0;i<a.length;i++)
       {
    	   System.out.println("Array elements are:" +a[i]);
       }
         input.close();
	}

}
