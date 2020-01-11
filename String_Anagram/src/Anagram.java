import java.util.*;
public class Anagram 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		String a,b;
		System.out.println("Enter First String :- ");
		a=input.nextLine();
		a=a.replace(" ", "");
		a=a.toLowerCase();
		System.out.println("Enter Second String :- ");
	    b=input.nextLine();
	    b=b.replace(" ", "");
	    b=b.toLowerCase();
	    char x[]=a.toCharArray();
	    char y[]=b.toCharArray();
	    
	    Arrays.sort(x);
	    Arrays.sort(y);
	    
	    boolean result=Arrays.equals(x, y);
	    if(result==true)
	    {
	    	System.out.println("Strings Are Anagram");
	    	System.exit(0);
	    }
	    else
	    {
	    	System.out.println("Strings Are Not Anagram");
	    	System.exit(0);
	    }
	    input.close();
	}

}
