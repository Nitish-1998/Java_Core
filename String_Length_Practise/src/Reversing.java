public class Reversing 
{

	public static void main(String[] args) 
	{
		String x="This is the String";
		x=x.concat("\0");
		char []y=x.toCharArray();
		int count=0,i=0;
		while(y[i]!='\0')
		{
			++count;
			++i;
		}
		System.out.println("Length of string is: "+count);

	}

}
