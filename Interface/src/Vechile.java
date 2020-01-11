interface Vechile 
{
  int i=50;
  void run();
  void bike();
}
class Honda implements Vechile
{
	public void run()
	{
		System.out.println("Run Function");
	}
	public void bike()
	{
		System.out.println("Bike Function");
	}
}
class Main
{
	public static void main(String args[])
	{
		Honda h1=new Honda();
		h1.run();
		h1.bike();
		
	}
}