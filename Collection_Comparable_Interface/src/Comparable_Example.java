import java.util.ArrayList;
import java.util.List;

public class Comparable_Example 
{

	public static void main(String[] args) 
	{
		List<Student>values=new ArrayList<Student>();
		values.add(new Student(1,49));
		values.add(new Student(2,46));
		values.add(new Student(3,52));
		values.add(new Student(4,96));
		values.add(new Student(5,83));
		values.add(new Student(6,46));
		values.add(new Student(7,35));
		
		for(Student sd:values)
		{
			System.out.println(sd);
		}
	}

}
class Student implements Comparable<Student>
{
	int rollno;
	int marks;
	
	public Student(int rollno,int marks)
	{
		this.rollno=rollno;
		this.marks=marks;		
	}
	public String toString()
	{
		return "Student{"+"RollNo: "+ rollno +", Marks: "+ marks+"}";
		
	}
	@Override
	public int compareTo(Student s) 
	{	
		return this.marks>s.marks?-1:this.marks<s.marks?1:0;
	}
	
}
