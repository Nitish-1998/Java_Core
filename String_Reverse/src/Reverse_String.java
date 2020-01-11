import java.util.*;
public class Reverse_String 
{

	public static void main(String[] args) 
	{   String rev=new String();
	    String s1;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string u want to reverse: ");
		s1=input.next();
		//String s1= new String("Gwalior");
		for(int i=s1.length()-1;i>=0;--i)
		{
			char c=s1.charAt(i);
			rev=rev+c;
		}
        System.out.println(rev);				
        input.close();
	}

}
