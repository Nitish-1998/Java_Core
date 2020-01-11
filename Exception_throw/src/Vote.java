class Vote 
{
	static void validate(int age)
	{
		if(age<18) 
		{
		throw new ArithmeticException("Not Valid age");
		}
		else
		{
			System.out.println("Welcome to Vote");
		}	
	}
	public static void main(String args[])
	{
		validate(15);
	}

}
