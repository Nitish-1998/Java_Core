import java.util.*;
public class ReverseNumber 
{

	public static void main(String args[]) 
	{
	 int num,rev=0,rem;
     Scanner input=new Scanner(System.in);
     System.out.println("Enter number u want to reverse : ");
     num=input.nextInt();
      int temp=num;
     while(num>0)
     {
    	 rem=num%10;
    	 rev=rev*10+rem;
    	 num=num/10;
    	 
     }
     System.out.println(rev);
        if(temp==rev)
        {	System.out.println("No. is palindrome");
        }
        else
        {
          System.out.println("No. is not palindrome");	
        }
	}

}
