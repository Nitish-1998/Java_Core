import java.util.*;

public class Array_sort 
{
    public static void main(String[] args)
    {
    	int a[];
    	Scanner input=new Scanner(System.in);
		System.out.print("enter size of Array: ");
		int x=input.nextInt();
		a=new int[x];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the element: ["+i+"]");
			a[i]=input.nextInt();
		}

        
        Arrays.sort(a);
        

        System.out.printf("Modified arr[] : %s",
                          Arrays.toString(a));
        System.out.println("\n smallest element: "+a[0]);
        input.close();
    }
   
}
