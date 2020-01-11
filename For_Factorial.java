import java.util.*;
class  For_Factorial
{
	public static void main(String[] args) 
	{int n,fact=1,i;
	 Scanner input=new Scanner(System.in);
     System.out.println("Enter Number U want Factorial:");
	 n=input.nextInt();
	 for(i=1;i<=n;i++)
		{
		  fact=fact*i;

	    }
		System.out.println("Factorial is : "+fact);
	}
}
