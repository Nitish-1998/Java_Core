import java.util.*;
public class Array_Position 
{

	public static void main(String[] args) 
	{   
		int arr[][];
		Scanner input=new Scanner(System.in);
        System.out.println("Enter row :");
        int r=input.nextInt();
        System.out.println("Enter Column:");
        int c=input.nextInt();
        arr =new int[r][c];
        System.out.println("Elements Are");
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=0;j<arr.length;j++)
        	{
        		arr[i][j]=input.nextInt();
        	}
        }
        System.out.println("Enter element you want to see index:");
        int ind=input.nextInt();
        int i,j;
        for(i=0;i<arr.length;i++)
        {
        	for(j=0;j<arr.length;j++)
        	{   
        		 if(ind == arr[i][j])
        		 {
                 		  System.out.print("Row:"+i);
                		  System.out.print("Column:"+j);                             
        		 }
        		
        			 
        	}  
        	input.close();
        }
         	
	}

}
