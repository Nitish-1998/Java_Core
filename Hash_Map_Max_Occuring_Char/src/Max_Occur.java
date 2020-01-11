import java.util.*;
public class Max_Occur 
{
	public static void main(String[] args) 
	{
		String s="God_Bless_Spiderman";
		s=s.toLowerCase();
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
				int oldv=map.get(x[i]);
				int newv=oldv+1;
				map.put(x[i], newv);
			}
		}
		Set<Map.Entry<Character,Integer>>hmap=map.entrySet();
		char maxkey=' ';
		int maxval=0;
		for(Map.Entry<Character, Integer>data:hmap)
		{
			if(data.getValue()>maxval)
			{
				maxkey=data.getKey();
				maxval=data.getValue();
			}
		}
		System.out.println("Max Val And  Key Are:- "+maxval+" "+maxkey);

	}

}
