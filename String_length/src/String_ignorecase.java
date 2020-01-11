import java.util.*;
public class String_ignorecase 
{

	public static void main(String[] args) 
	{Scanner input=new Scanner(System.in);
	 String s1=new String("Gwalior");
	 String s2=new String("gwalior");
	 if(s1.equalsIgnoreCase(s2))
	 {
		 System.out.println("it is equal");
		 
	 }
	 else
	 {
		 System.out.println("it is not equal");
	 }
      input.close();
	}
		

	}


