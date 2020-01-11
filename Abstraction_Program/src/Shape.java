abstract class Shape 
{
	abstract void draw();

}
class rectangle extends Shape
{
	void draw()
	{
		System.out.println("This is rectangele");
	}
}
class circle extends Shape
{
	void draw()
	{
		System.out.println("THIS IS CIRCLE");
	}
}
class triangle extends Shape
{
	void draw()
	{
		System.out.println("This is triangle");
	}
}
class Mainclass
{
	public static void main(String args[])
	{
		Shape s1=new rectangle();
		s1.draw();
		Shape s2=new circle();
		s2.draw();
		Shape s3=new triangle();
		s3.draw();
	}
}