
class Employee 
{ 
	int eid;
	String name;
	long sal;
  Employee(int eid,String name,long sal)
  {
	  this.eid=eid;
	  this.name=name;
	  this.sal=sal;
  }
  void put_Employee()
  {
	  System.out.println("Eid:"+eid+"Name:"+name+"Salary: "+sal);
	  
  }
	
}
class perks extends Employee
{
	int da;
	int hra;
	int pf;
	
	perks(int eid,String name,long sal,int da,int hra, int pf)
	{
		super(eid,name,sal);
		this.da=da;
		this.hra=hra;
		this.pf=pf;
	}
	void put_Perks()
	{
		put_Employee();
		System.out.println("DA:"+da+"HRA:"+hra+"PF:"+pf);		
	}
}
class Exmain
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        perks p=new perks(101,"Karan",45000,2000,20000,5000);
        p.put_Perks();
	}

}
