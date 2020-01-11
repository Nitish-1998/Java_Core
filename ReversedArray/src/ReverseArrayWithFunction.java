public class ReverseArrayWithFunction
{
	public static int [] reverseme(int []a)
	{
		int arr[];
		arr=new int[a.length];
		int j=a.length-1;
		for(int i=0;i<a.length;i++)
		{
			arr[i]=a[j];
			j--;
		}
						
		return arr;
	}

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		int revarr[]=reverseme(arr);
		
		for(int i:revarr)
		{
			System.out.println(i);
		}

	}

}
