import java.util.*;
public class Switch_choices2 
{

	public static void main(String[] args) 
	{
		Scanner input =new Scanner(System.in); 
		System.out.println("Enter Number: ");
		int n=input.nextInt();
		System.out.println("Enter your choices: \n 1. Primeno. \n 2.Even or Odd \n 3.Factorial ");
		int choice =input.nextInt();
		switch(choice)
        {
		 case 1:
				{
					int status=0;
					for(int i=2;i<n;i++)
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
					       break;
			    }
						
				
				   
			 case 2:
			  { 
				 if(n%2==0)
					{
					 System.out.println("No is even");
					 
				    }
				 else
				 {
					 System.out.println("No. is odd");
					 
				 }
				 break;
			  }
			
			case 3:
			{ 
				int fact=1;
			
				for(int i=1;i<=n;i++)
				{
				  fact=fact*i;

			    }
				System.out.println("Factorial is : "+fact);
				break;
			}
		
      }
   }
}