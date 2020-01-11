class Base
{
	Base()
	{
		System.out.println("This is Base Class");
		
	}
	Base(int x)
	{
		System.out.println("The value of x in Base: "+x);
	}
}

class Derived extends Base
{
	Derived()
	{
		//super();
		System.out.println("This is Derived Class");
		
		
	}
	Derived(int y)
	{
		super(y);
		System.out.println("This value of y in derived is: "+y);
	}
}
class Example{
 public static void main(String args[])
{
	 Derived d1=new Derived();
	 Derived d2 =new Derived(30);
}
}	