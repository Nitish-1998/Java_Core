import java.util.*;
public class abc 
{  private int x,y;
   
   void get(int x,int y)
   {
	   this.x=x;
	   this.y=y;
   }
   void put()
   {
	   System.out.println("Your value of x is" +x);
	   System.out.println("Your value of y is" +y);
   }
}
    class abc_main
    {
	public static void main(String[] args) 
	{
		abc obj=new abc();
		obj.get(10,15);
		obj.put();
		

	}

    }
