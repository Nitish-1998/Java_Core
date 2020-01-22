import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator_Example 
{

	public static void main(String[] args) 
	{
		List<Student>values=new ArrayList<Student>();
		values.add(new Student(1,95));
		values.add(new Student(2,56));
		values.add(new Student(3,63));
		values.add(new Student(4,85));
		values.add(new Student(5,75));
		
		Collections.sort(values,(s1,s2)->
		{
			return s1.marks>s2.marks?-1:s1.marks<s2.marks?1:0;
		});
		
		for(Student s:values)
		{
			System.out.println(s);
		}
		
	}

}
class Student
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
		return "Student{"+"RollNo="+rollno+",Marks="+marks+"}";
	}
}
