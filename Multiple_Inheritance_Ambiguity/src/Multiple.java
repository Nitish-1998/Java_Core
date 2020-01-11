class Father
{
	static int a=10;
	static int b;
	static int add(int y)
	{
		b=y;
		return(a+b);
	}
	
}

interface Mother
{    int c=30;  //Public Static Final 
     void display();
}

public class Multiple extends Father implements Mother
{
	int m=a*Mother.c;
	int sum=add(20);
	public void display() 
	{
		

		System.out.println("Addition:- "+sum);
	    System.out.println("Multiply:- "+m);
		
	}
	
	public static void main(String[] args) 
	{
		Multiple objm=new Multiple();
		objm.display();
		
	}
	
	

}
