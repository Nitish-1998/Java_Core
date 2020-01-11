import java.util.*;
public class Integer_In_String 
{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		String x;
		System.out.println("Enter the String :- ");
		x=input.nextLine();
		for(int i=0;i<x.length()-1;i++)
		{
			if(x.charAt(i)>='0' && x.charAt(i)<='9')
			{
				continue;
			}
			else
			{
				System.out.println("It is not an Integer String");
				System.exit(0);
			}
		}
		System.out.println("It is an Integer String");
		input.close();
	}

}
