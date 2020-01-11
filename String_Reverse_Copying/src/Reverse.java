import java.util.*;
public class Reverse 
{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		String s;
		System.out.println("Enter the String you want to reverse:");
		s=input.nextLine();
		char []a=s.toCharArray();
		int j=a.length;
		char[]x=new char[j];
		int z=0;
		for(int i=s.length()-1;i>=0;--i)
		{
			if(z!=s.length())
			{
				x[z]=a[i];
				++z;
			}
			
		}
		System.out.println(x);
		input.close();

	}

}
