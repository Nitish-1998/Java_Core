import java.util.*;
public class String_endswith 
{

	static public void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
	    String s[]= {"Jaipur","Jodhpur","Gwalior","Nagpur","Raipur","Mumbai"};
		 for(int i=0;i<s.length;i++)
		 {
			 if(s[i].endsWith("pur"))
	     	 {
			   System.out.println(s[i]);
		     }
			 
      	 }
	 
		input.close();

	}

}
