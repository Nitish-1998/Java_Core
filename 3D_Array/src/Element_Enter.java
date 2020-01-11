import java.util.*;
public class Element_Enter 
{

	public static void main(String[] args) 
	{ int arr[][][];
	  Scanner input=new Scanner(System.in);
	  System.out.println("Enter Row: ");
	  int r=input.nextInt();
	  System.out.println("Enter column: ");
	  int c=input.nextInt();
	  arr=new int[2][r][c];
	  System.out.println("Enter Elements: ");
	   for(int i=0;i<arr.length;i++)
	   {
		   for(int j=0;j<arr.length;j++)
		   {
			   for(int k=0;k<arr.length;k++)
			   {
				   arr[i][j][k]=input.nextInt();
			   }
		   }
	   }
	   for(int i=0;i<arr.length;i++)
		  {
			  for(int j=0;j<arr.length;j++)
			  { 
				  for(int k=0;k<arr.length;k++)
				  {
					  System.out.print(arr[i][j][k] +" ");
				  }
                                                                  System.out.println();
		      }
		   
		  }
          input.close();
	}

}
