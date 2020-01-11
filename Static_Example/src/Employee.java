import java.util.*;
public class Employee 
{  int eid;
   int salary;
   static String ceo="Akash";
   
   void show()
   {
	   System.out.println(eid+" ,"+salary+" ,"+ceo);
   }
   static
   {
	   System.out.println(ceo);
	   System.out.println("IN static Block");
   }
}
  class demo{
	public static void main(String[] args) 
	{
	  Employee rahul=new Employee();
	  rahul.eid=112;
	  rahul.salary=2000;
	  rahul.ceo="vivek";
			  Employee ravi=new Employee();
	          ravi.eid=12;
	          ravi.salary=2300;
	          ravi.ceo="parul";
              rahul.show();
              ravi.show();
	}

}
