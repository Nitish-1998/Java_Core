import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class List_Example 
{

	public static void main(String[] args) 
	{
	   List<Integer>values=new ArrayList<Integer>();
	   values.add(29);
	   values.add(89);
	   values.add(77);
	   values.add(23);
	   
	   values.add(1, 2);// This Functionality is only in list.
       	   
	   Collections.sort(values);
	    values.forEach(System.out::println);

	}

}
