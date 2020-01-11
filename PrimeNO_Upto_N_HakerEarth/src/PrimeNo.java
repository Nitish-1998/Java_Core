import java.util.*;
public class PrimeNo 
{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int n;
		System.out.println("Enter the range Where upto u want to print number:  ");
		n=input.nextInt();
		for(int i=2;i<=n;i++)
		{
			int status=0;
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					status=1;
					break;
					
				}

			}
			if(status==0)
			{
			   System.out.print( i +" ");
			}

		}
		input.close();

	}

}
