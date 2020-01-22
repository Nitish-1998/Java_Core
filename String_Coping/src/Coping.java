import java.util.*;
public class Coping 
{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		String s1;
		System.out.println("Enter the String do you want to copy:  ");
        s1=input.nextLine();
        char []x=s1.toCharArray();
        int s=s1.length();
        char [] a=new char[s];
        for(int i=0;i<x.length;i++)
        {
        	a[i]=x[i];
        }
        System.out.printf("Copied array is: ");
        System.out.println(a);
        input.close();
        
	}

}
