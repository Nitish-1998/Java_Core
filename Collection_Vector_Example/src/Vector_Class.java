import java.util.Vector;

public class Vector_Class 
{
	public static void main(String[] args) 
	{
		Vector<Integer> values=new Vector<Integer>();
		values.add(20);
		values.add(35);
		values.add(89);
		values.add(16);
		values.add(73);
		values.add(94);
		
		values.remove(3);
		System.out.println("This is the Capacity Of Vector:-"+values.capacity());
		
		for(int i:values)
		{
			System.out.println(i);
		}
		System.exit(0);

	}

}
