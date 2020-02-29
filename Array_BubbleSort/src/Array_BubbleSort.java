import java.util.*;
public class Array_BubbleSort 
{

	public static void main(String[] args) 
	{
		 int a[];
	     Scanner input=new Scanner(System.in);
		 System.out.println("Enter Size of Array: ");
		 int n=input.nextInt();
         a=new int[n];
         for(int i=0;i<a.length;i++)
         {
      	   System.out.println("Enter Element in Array: ");
      	   a[i]=input.nextInt();
         }
         int temp=0;
         for(int i=0;i<a.length;i++)
         {
        	for(int j=1;j<a.length-i;j++)
        	{
        		if(a[j-1]>a[j])
        		{
        			temp=a[j-1];
        			a[j-1]=a[j];
        			a[j]=temp;
        		}
        	}
         }
         System.out.println("Bubble Sorted Element are: ");
         for(int i=0;i<a.length;i++)
         {
        	 System.out.println(a[i]);
         } 
         input.close();
	}     

}
