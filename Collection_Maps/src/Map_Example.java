import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Example 
{
	public static void main(String[] args) 
	{
		Map<String,String>map=new HashMap<>();
		map.put("Name", "Nitish");
		map.put("Actor", "Rabir");
		map.put("Ceo", "Sundar");
		
		Set<String>keys=map.keySet();
		for(String key:keys)
		{
			System.out.println(key +" : "+map.get(key));
		}
		

	}

}
