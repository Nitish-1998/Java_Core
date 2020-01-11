class Abc_Ex
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
		Abc_Ex obj=new Abc_Ex();
		obj.get(10,15);
		obj.put();

}

}
