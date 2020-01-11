import java.util.*;
class  For_Primeno
{
	public static void main(String[] args) 
	{
		
	  int n,i=2,status=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no. Do you wamt to check: ");
		n=input.nextInt();
        for(i=2;i*i<=n;i++)
		{
			  if(n%i==0)
				{
				  status ++;
				  break;
			                }
				 
		}
		       if(status==1)
		       { 
				   System.out.println("No. is not prime");
			   }
                
               else if(n==1)
		       {
				   System.out.println("No. is one it is not prime no.");

			   }
			   else
	           {
				   System.out.println("No. is prime");
			   }
		       
		 
		 

	}
}
