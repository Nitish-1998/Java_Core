import java.util.*;
public class Abc 
{
	public static void main(String[] args) 
	{
		String s="nitish";
		char x[]=s.toCharArray();
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<x.length;i++)
		{
			if(map.containsKey(x[i])==false)
			{
				map.put(x[i], 1);
			}
			else
			{
				int oldval=map.get(x[i]);
				int newval=oldval+1;
				map.put(x[i], newval);
			}
		}
		Set<Map.Entry<Character,Integer>> hmap=map.entrySet();
		for(Map.Entry<Character, Integer>data:hmap)
		{
			System.out.print(data.getKey());
			System.out.print(" ");
			System.out.println(data.getValue());
			
		}
		
	}

}
