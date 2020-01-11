import java.util.*;
class For_Sum_of_evenno 
{
	public static void main(String[] args) 
	{int s,l,ad=0;
	 Scanner input=new Scanner(System.in);
	 System.out.print("Enter The Number where u want to start:");
	 s=input.nextInt();
	 System.out.print("Enter the Number where u Want to end: ");
	 l=input.nextInt();
	 if(s%2!=0)
		{
		 s++;
	    }
	 while(s<=l)
		{
		 System.out.println(s);
		 ad=ad+s;
		 s=s+2;
	 }
	     System.out.println("This Sum of Even Numbers is: "+ad);
	}
}

