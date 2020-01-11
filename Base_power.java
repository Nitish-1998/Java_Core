import java.util.*;
class  Base_power
{
	public static void main(String[] args) 
	{int b,p,n=1;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number:");
		b=input.nextInt();
		System.out.println("Enter Power:");
		p=input.nextInt();
		while(p>=1)
		{
			n=n*b;
			p=p-1;
		}
		System.out.println("Answer is:"+n);
	}
}
