public class Rev 
{
	public static int[] reversearray(int []a)
	{	
		int[] arr=new int[a.length];
		int j=a.length-1;
		
		for(int i=0;i<a.length;i++)
		{
			
			 arr[j]=a[i];
			 j--;
			
		}
		
		return arr;
		
	}

	public static void main(String[] args) 
	{
		int temparray[]= {5,4,9,6,1,3};
		int rev[]=reversearray(temparray);
		System.out.println("Reverse Array Are:-");
		for(int i:rev)
		{
			System.out.println(i);
		}
		

	}

}
