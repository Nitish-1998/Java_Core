import java.util.*;
public class Reverse_for 
{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int n,rev=0,rem,temp;
        System.out.println("Enter number you want to reverse: ");
        n=input.nextInt();
        temp=n;
        for(int i=0;i<=n;i++)
        {
        	rem=n%10;
        	rev=rev*10+rem;
        	n=n/10;
        	
        }
        System.out.println(temp+" Reverse no. of " +rev);
	}   

}
