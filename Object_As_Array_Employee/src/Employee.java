import java.util.*;
public class Employee 
{   private String name;
private int id;
private float sal,gst,hra,da,netsal;
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
		netsal=(float)(sal+(sal*(10/100))+hra+da);
	}
	else if(sal>50000)
	{
		netsal=(float)(sal+(sal*(20/100))+hra+da);
	}
	else if(sal>80000)
	{
		netsal=(float)((sal+sal*(30/100)+hra+da)-sal*gst/100);
	}
}
void put_Detail_Employee()
{
	  System.out.println("Employee Name: "+name);
	  System.out.println("Employee id: "+id);
	  System.out.println("Employee Hra: "+hra);
	  System.out.println("Employee Da: "+da);
	  //System.out.println("Employee Bonus: "+bo);
	  System.out.println("Employee Salary: "+netsal);
}


	public static void main(String[] args) 
	{ Scanner input=new Scanner(System.in);
	  System.out.println("Enter Number of Employees You want: ");
	  int n=input.nextInt();
	  Employee e[]=new Employee[n];
	  for(int i=0;i<e.length;i++)
	  {
		  e[i]=new Employee();
		  e[i].get_Details();		  
	  }
	  for(int i=0;i<e.length;i++)
	  {
		  e[i].management();
		  e[i].put_Detail_Employee();
	  }

	}

}
