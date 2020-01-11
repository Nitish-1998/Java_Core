import java.util.*;
public class Abc_This_Object 
{    private int x,y;
     void get(int x,int y)
     { 
    	 this.x=x;
    	 this.y=y;   	 
     }
     void put()
     {
    	 System.out.println("Your value of x is : "+x);
    	 System.out.println("Your value of y is :"+y);
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
