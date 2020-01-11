abstract class Vechile
{
	abstract void car();
	  void bus() 
	  {
		  System.out.println("Bus function");
	  }
}
class Exmain extends Vechile
{
	void car()
	{
		System.out.println("Car function");
	}
}
class Mainclass
{
	public static void main(String args[])
	{
		Vechile v1=new Exmain();
		v1.car();
		v1.bus();
	}
}

