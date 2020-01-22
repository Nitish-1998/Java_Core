import java.util.ArrayList;
import java.util.Collection;

public class DemoClass 
{

	public static void main(String[] args) 
	{
		Collection<Integer>values=new ArrayList<Integer>() 
		{{
			add(48);
			add(24);
			add(25);
			add(59);
			
		}};// This is anomynous Class Which has no name.		
		//values.remove(59);
		for(int val:values)
		{
			System.out.println(val);
		}
	

	}

}
