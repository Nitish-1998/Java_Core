import java.util.*;
public class String_length 
{

	public static void main(String[] args) 
	{  String s1;
       Scanner input=new Scanner(System.in);
       System.out.println("Enter string you want to check length: ");
       s1=input.next();
       System.out.println("The length of given string is: " +s1.length());
	   input.close();
	}

}
