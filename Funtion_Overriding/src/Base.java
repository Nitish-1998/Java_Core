class Base 
{
	void show()
	{
		System.out.println("This Method Show Base class");
	}

}
class Derived extends Base
{
	void show()
	{
		System.out.println("This Method Show the Derived Class");
        super.show();	
	}
}
class Ex_Overriding
{
	public static void main(String args[])
	{
		Derived d1=new Derived();
		d1.show();
	}
}