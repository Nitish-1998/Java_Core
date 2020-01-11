import java.util.*;
public class Multiplication
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
         int n,i,t;
         Scanner input=new Scanner(System.in);
         System.out.println("Enter No:");
         n=input.nextInt();
         for(i=1;i<=10;i++)
         {
        	 t=n*i;
        	 System.out.println(n+"*"+i+"="+t);
        	 
         }
	}

}
