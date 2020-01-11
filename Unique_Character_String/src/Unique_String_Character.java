import java.util.*;
public class Unique_String_Character {
	
	public static void main(String[] args) 
	{
		String s;
		Scanner input=new Scanner(System.in);
	    System.out.println("Enter the String:- ");
	    s=input.nextLine();
		char x[]=s.toCharArray();
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<s.length()-1;i++)
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
		Set<Map.Entry<Character, Integer>>hmap=map.entrySet();
		for(Map.Entry<Character, Integer>data:hmap)
		{
			System.out.print(data.getKey()+" ");
			System.out.println(data.getValue());
			
		}
		
		for(Map.Entry<Character, Integer>data:hmap)
		{
			if(data.getValue()>1)
			{
				System.out.println("Doesn't Contain Unique Character");
				System.exit(0);
			}
			
		}
		
		 System.out.println("Contains All Unique Character");

	}

}
