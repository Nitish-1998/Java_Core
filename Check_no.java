import java.util.*;
class Check_no 
{
	public static void main(String[] args) 
	{int n;
	 Scanner input=new Scanner(System.in);
	 System.out.print("Enter any number:");
	 n=input.nextInt();
	 if(n>0)
	 {
         System.out.print("It is Poitive Number");
		 
     }
     else if(n<0)	
	 { 
		 System.out.print("It is a Negative Number");
	 }
	 else
     {
		 System.out.print("Number is Zero");
	 }
	}
}
