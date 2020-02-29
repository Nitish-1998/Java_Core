//In this question you have to find the binary bit digit Count?
import java.util.*;
public class Bit_Count 
{

	public static void main(String[] args) 
	{
		int bit[]=new int[100];
		int ind=0,n,count=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Number You want to see bit size:  ");
		n=input.nextInt();
		for(int i=0;i<n;i++)
		{
			bit[ind++]=n%2;
			n=n/2;
		}
		System.out.print("The decimal to binary are: ");
		for(int i=ind-1;i>=0;i--)
		{
			  count++;
			  System.out.print(bit[i]);
			
		}
		System.out.println();
		System.out.println("The Number of bit is: " +count);
		
		input.close();
		System.exit(0);

	}

}
