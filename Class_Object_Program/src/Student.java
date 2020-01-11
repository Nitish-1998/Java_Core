import java.util.*;
 public class Student 
{      private int rollno,p,c,m;
	   private String name;
	   private float per;
	   Scanner input=new Scanner(System.in);
	   void get_Detail()
	   {
		   System.out.println("Enter your Name: ");
		   name=input.nextLine();
		   System.out.println("Enter your rollno: ");
		   rollno=input.nextInt();
		   System.out.println("Enter P,C,M Marks: ");
		   p=input.nextInt();
		   c=input.nextInt();
		   m=input.nextInt();		   
	   }
	   void show_Percentage()
	   {
		   per=(float)(p+c+m)/3;
	   }
	   void put_Details()
	   {
		   System.out.println("Your RollNo. is: "+rollno);
		   System.out.println("Your Name is : "+name);
		   System.out.println("Your Marks of Physics: "+p);
		   System.out.println("Your Marks of Chemistry: "+c);
		   System.out.println("Your Marks of Maths: "+m);
		   System.out.println("Your Marks of Percetage: "+per);		   		     
	   }
	  	
	public static void main(String[] args) 
	{     
		  Student s1=new Student();
		   s1.get_Detail();
		   s1.show_Percentage();
		   s1.put_Details();
	}	   


}