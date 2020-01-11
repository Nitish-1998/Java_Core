import java.util.*;
public class Low_To_Upp 
{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		String s;
		System.out.println("Enter  String:-  ");
		s=input.nextLine();
		char y[]=s.toCharArray();
		int c;
		System.out.println("Enter your choice: ");
		System.out.println("1.Upper Case Press 1");
		System.out.println("2.Lower Case Press 2");
		c=input.nextInt();
		switch(c)
	  {
		case 1:
		{
			for(int i=0;i<=s.length()-1;i++)
			{
				if(y[i]!=' ')
				{
					y[i]=(char)(y[i]-32);
				}
				
			}
			System.out.println(y);
			break;
		}
		case 2:
		{
			
			for(int i=0;i<=s.length()-1;i++)
			{
				if(y[i]!=' ') 
				{
				   y[i]=(char)(y[i]+32);
				}
			}
			System.out.println(y);
			break;
		}
		default:
		{
			System.out.println("You Have Entered Wrong Choice");
			break;
		
		}
		
	 }
		
		input.close();

	}

}
