import java.util.*;
class  For_Evennumber
{
	public static void main(String[] args) 
	{ int s,l,i=1;
	  Scanner input=new Scanner(System.in);
	  System.out.println("Enter Smallest Number where u want to start:");
	  s=input.nextInt();
	  System.out.println("Enter Largest Number Where u want to end: ");
	  l=input.nextInt();
      if(s%2!=0)
			{
			  s++;
		    }
	  for(i=1;s<=l;i++)
		{
		  
          System.out.println(s);
		  s=s+2;

	    }
		
	}
}
