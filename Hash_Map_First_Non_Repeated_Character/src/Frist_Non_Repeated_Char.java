import java.util.*;
public class Frist_Non_Repeated_Char 
{
	public static void main(String[] args) 
	{
		String s="SillySpider";
		char x[]=s.toCharArray();
		Map<Character,Integer>map=new LinkedHashMap<>();
		for(int i=0;i<x.length;i++)
		{
			if(map.containsKey(x[i])==false)
			{
				map.put(x[i], 1);
			}
			else
			{
				int oldval=map.get(x[i]);
				int newval = oldval+1;
				map.put(x[i],newval);
			}
		}
		Set<Map.Entry<Character,Integer>> hmap=map.entrySet();
		for(Map.Entry<Character, Integer>data:hmap)
		{
			if(data.getValue()==1)
			{
				System.out.println(data.getKey()+" "+data.getValue());
				System.exit(0);
			}
		}

	}

}
