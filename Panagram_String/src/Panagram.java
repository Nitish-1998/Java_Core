public class Panagram 
{
	public static void main(String[] args) 
	{
		String s="THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
		System.out.println(s);
		s=s.replace(" ", "");
		char x[]=s.toCharArray();
		int arr[]=new int[26];
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=0;
        }
        for(int i=0;i<=s.length()-1;i++)
        {
        	int index=x[i]-65;
        	arr[index]=1;
        }
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]==1)
        	{
        		continue;
        	}
        	else
        	{
        		System.out.println("It is not a panagram");
        		System.exit(0);
        	}
        }
        System.out.println("It is Panagram");
	}
}

