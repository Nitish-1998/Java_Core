import java.util.*;
class  Even_nums
{
	public static void main(String[] args) 
	{int s,l;
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
		 s=s+2;
	 }
	}
}
