import java.util.*;
class  Marks
{
	public static void main(String[] args) 
	{int hindi,english,sst,science,maths,computer,r;
	 String S;
	 Scanner input=new Scanner(System.in);
	 System.out.println("Enter name:-");
	 S=input.next();
	 System.out.println("Enter rollno of student:");
	 r=input.nextInt();
	 System.out.println("Enter Hindi marks: ");
	 hindi=input.nextInt();
     System.out.println("Enter English marks: ");
	 english=input.nextInt();
	 System.out.println("Enter Social Studies  marks: ");
	 sst=input.nextInt();
	 System.out.println("Enter Science marks: ");
	 science=input.nextInt();
	 System.out.println("Enter Maths marks: ");
	 maths=input.nextInt();
	 System.out.println("Enter Computer marks: ");
     computer=input.nextInt();
	 int per,ttl;
	 ttl = hindi+english+sst+science+maths+computer;
	 per=(ttl)/6;
	 System.out.println(per);
	 if(per>=60)
			{System.out.print("1st division");
			 System.out.println("A");
			}
     else if(per>=45)
			{System.out.print("2nd Division");
			 System.out.print("B");
		    }
		 
	 else 
        {System.out.print("Fail");
	     System.out.print("C");
	    }
   
	    
	}
}
