import java.util.*;
class  Prime_no
{
	public static void main(String args[]) 
	{
		int n,i=2,status=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no. Do you wamt to check: ");
		n=input.nextInt();
        while(i<n)
		{
			  if(n%i==0)
				{
				  status ++;
				  break;
			    }
				 i++;
		}
		       if(status==1||n==0||n<0)
		       { 
				   System.out.println(n+ " No. not is prime");
			   }
                
               else if(n==1)
		       {
				   System.out.println(n+ " No. is one it is not prime no.");

			   }
			   else
	           {
				   System.out.println(n+ " No. is  prime");
			   }
		       
		 
		 

	}
}
