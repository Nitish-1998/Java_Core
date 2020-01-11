public class ex_main 
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
	
//	public static void main(String args[])
//	 {
//		 ex_main ex=new ex_main();
//		 ex.method3();
//	 }
//	
}
 class Result
{
 public static void main(String args[])
 {
	 ex_main ex=new ex_main();
	 ex.method3();
 }
}