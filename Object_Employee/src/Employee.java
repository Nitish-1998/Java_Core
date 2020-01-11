import java.util.*;
public class Employee 
{ private String name;
  private int id;
  private float sal,gst,hra,da;
  Scanner input=new Scanner(System.in);
  void get_Details()
  {
	  System.out.println("Enter Employee Name: ");
	  name=input.nextLine();
	  System.out.println("Enter Employee id: ");
	  id=input.nextInt();
	  System.out.println("Enter Employee Salary: ");
	  sal=input.nextInt();
	  System.out.println("Enter Hra,Da: ");
	  hra=input.nextInt();
	  da=input.nextInt();
	  System.out.println("Enter G.S.T: ");
	  gst=input.nextFloat();
  }
  void management()
  { hra=(hra/100)*sal;
    da=(da/100)*sal;
	if(sal>20000)
	{
		sal=(float)(sal+((10/100)*sal)+hra+da);
	}
	else if(sal>50000)
	{
		sal=(float)(sal+((20/100)*sal)+hra+da);
	}
	else if(sal>80000)
	{
		sal=(float)((sal+((30/100)*sal)+hra+da)-((gst/100)*sal));
	}
  }
  void put_Detail_Employee()
  {
	  System.out.println("Employee Name: "+name);
	  System.out.println("Employee id: "+id);
	  System.out.println("Employee Hra: "+hra);
	  System.out.println("Employee Da: "+da);
	  //System.out.println("Employee Bonus: "+bo);
	  System.out.println("Employee Salary: "+sal);
  }

	public static void main(String[] args) 
	{
      Employee e1=new Employee();
      e1.get_Details();
      e1.put_Detail_Employee();
      e1.management();
      System.out.println("After All Management Employee:");
      e1.put_Detail_Employee();
	}

}
