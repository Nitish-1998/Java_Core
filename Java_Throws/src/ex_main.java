class Example
{
	void method1() throws ArithmeticException
	{
		throw new ArithmeticException("Error Occured");
	}
	void method2() throws ArithmeticException
	{
		method1();
	}
	void method3()
	{
		try
		{
			method2();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Generated");
		}
		
	}
	
}
public class ex_main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Example ex=new Example();
		 ex.method3();

	}

}
