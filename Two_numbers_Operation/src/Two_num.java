import java.util.*;
public class Two_num 
{
	public void  add(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Add:"+c);	
	}
	
	public void  difference(int a,int b)
	{
		int c;
		c=a-b;
		System.out.println("Diff: "+c);	
	}
	
	public void  divide(int a,int b)
	{
		int c;
		c=a/b;
		System.out.println("Divide: "+c);	
	}
	
	public void  multiply(int a,int b)
	{
		int c;
		c=a*b;
		System.out.println("multiply: "+c);	
	}

	public static void main(String[] args) 
	{
		int x,y;
		Scanner input=new Scanner(System.in);
		Two_num obj=new Two_num();
		System.out.println("Enter the Numbers of which You want to Show Operation: ");
		x=input.nextInt();
		y=input.nextInt();
		obj.add(x, y);
		obj.difference(x, y);
		obj.divide(x, y);
		obj.multiply(x, y);
		input.close();

	}

}
