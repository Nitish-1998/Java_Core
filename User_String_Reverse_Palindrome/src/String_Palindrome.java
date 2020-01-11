import java.util.*;
public class String_Palindrome 
{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
 		String x=new String("too Hot to HooT");
 		x=x.replace(" ","");
 		x=x.toUpperCase();
 		String rev=new String();
 		String temp=new String();
 		//System.out.println("Enter the String which U want to CHeck palindrome: ");
 		//x=input.nextLine();
 		
 		temp=x;
 		for(int i=x.length()-1;i>=0;--i)
 		{
 			char c=x.charAt(i);
 			rev=rev+c;
 			
 		}
 		if(temp.equals(rev))
 		{
 			System.out.println("Yes it is Palindrome");
 		}
 		else
 		{
 			System.out.println("NO it is not Palindrome");
 		}
 		
 		input.close();
		
	}

}
