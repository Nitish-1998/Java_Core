import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_Example 
{

	public static void main(String[] args) 
	{
		List<Integer> values=new ArrayList<>();
		values.add(35);
		values.add(89);
		values.add(76);
		values.add(19);
		values.add(82);
		values.add(35);
		// We have to sort the element on the basis of last digit.
		Comparator<Integer>com=(o1,o2)->
		{
			if(o1%10>o2%10)
			{
				return 1;
			}
			else 
			{
			  return 0;
			}
			
		};
		Collections.sort(values,com);
		
		for(int i:values)
		{
			System.out.println(i);
		}

	}

}
