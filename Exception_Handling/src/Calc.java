class Calc 
{
   public static void main(String args[])
   {
	   int a=0,b=100,c;
	   try 
	   {
		   c=b/a;
	   }
	   catch(ArithmeticException e)
	   {
		   System.out.println(e.getMessage());
		   System.out.println("You cannot divide by 0");
		   e.printStackTrace();
	   }
	   finally 
	   {
	     System.out.println("Finally block");       
	   }
   }
}
