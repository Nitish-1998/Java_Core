
public class Garbage_Collect {
	
	protected void finalize()
	{
		System.out.println("Object collected thik h");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Garbage_Collect gb1=new Garbage_Collect();
		System.out.println(gb1);
		gb1=null;
		System.out.println(gb1);
		
		System.gc();
		
	}

}
