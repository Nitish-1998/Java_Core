import java.util.*;
public class Array_Prime 
{

	public static void main(String[] args) 
	{ int arr[][];
	  Scanner input=new Scanner(System.in);
	  System.out.println("Enter Row: ");
	  int r=input.nextInt();
	  System.out.println("Enter Column: ");
	  int c=input.nextInt();
	  arr= new int[r][c];
	  System.out.println("Enter Elements: ");
	  for(int i=0;i<arr.length;i++)
	  {
		  for(int j=0;j<arr.length;j++)
		  {
			  arr[i][j]=input.nextInt();
		  }
	         
	  }
	  
	  for(int i=0;i<arr.length;i++)
	  {
		  for(int j=0;j<arr.length;j++)
		  {
			  int status=0;
			  for(int l=2;l*l<=arr[i][j];l++)
				{
					  if(arr[i][j]%l==0)
						{
						  status ++;
						  break;
					                }
						 
				}
				       if(status==1)
				       { 
						   System.out.println(arr[i][j]+" "+"No. is not prime");
					   }
		                
					   else
			           {
						   System.out.println(arr[i][j]+" "+"No. is prime");
					   }
				       
		  }	  
	  }
	   input.close();      
	  }
	  
	}


