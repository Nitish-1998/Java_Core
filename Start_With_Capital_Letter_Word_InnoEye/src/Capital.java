import java.util.*;
public class Capital 
{

	private static char[] as;

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
	    String x=new String(); 
		System.out.println("Enter the Word:");
	    x=input.nextLine();
	    as = x.toCharArray();
	    as[0]=(char)(as[0]-32);
	    for(int i=1;i<=x.length()-1;i++)
	    {
	    	if(as[i]==32)
	    	{
	    		as[i+1]=(char)(as[i+1]-32);
	    	}
	    	
	    }
	    System.out.println("Word Before Change:  "+x);
	    System.out.print("Word After Change: ");
	    System.out.print(as);
	    input.close();
	    
		

	}

}
