class Base 
{
	void show()
	{
		System.out.println("This is method show of base" );
	}

}
class Derived extends Base
{
	void show(int i)
	{
		System.out.println("This is Derived class"+i);
	}
}
class Ex_Overloading
{
	public static void main(String args[])
	{
		Derived d1=new Derived();
		d1.show(70);
		d1.show();
	}
}