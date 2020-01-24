import java.util.HashSet;
import java.util.Set;

public class Set_Example 
{

	public static void main(String[] args) 
	{
      Set<Integer>vals=new HashSet<Integer>();
      vals.add(59);
      vals.add(85);
      vals.add(92);
      vals.add(44);
      vals.add(85);// It will remove the repeated the digit. 
      
      for(int i:vals)
      {
    	  System.out.println(i);
      }
 
	}

}
