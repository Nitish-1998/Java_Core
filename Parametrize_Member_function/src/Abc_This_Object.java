
public class Abc_This_Object 
{    private int z,c;
     void get(int x,int y)
     { 
    	 this.z=x;
    	 this.c=y;   	 
     }
     void put()
     {
    	 System.out.println("Your value of x is : "+z);
    	 System.out.println("Your value of y is :"+c);
     }
}
    class Abc_Main
{
	  public static void main(String[] args) 
{
		Abc_This_Object obj=new Abc_This_Object();
		obj.get(10,15);
		obj.put();

}

}
