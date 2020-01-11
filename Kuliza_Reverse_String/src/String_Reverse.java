import java.util.*;
public class String_Reverse 
{

	public static void main(String[] args) 
	{ char ch;
	  Scanner input=new Scanner(System.in);
	  String s1=new String("Made in India");
	  String rev=new String();
	  for(int i=0;i<s1.length();i++)
	  {
		  ch=s1.charAt(i);
		  if(Character.isUpperCase(ch))
		  {
			 char c=(char) (ch+32);
			 rev=rev+c;
			 
		  }
		  else
		  {
			  char c= (char) (ch-32);
			  rev=rev+c;
		  }
	  }
	      System.out.println(rev);
		

	}

}
