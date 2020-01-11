import java.util.*;
public class Computer_Part 
{   private String name;
    private float price;
    private int quantity,n,stock;
    Scanner input=new Scanner(System.in);
    void get_Detail()
    {
    	System.out.print("Enter the name of Computer Part: ");
    	name=input.nextLine();
    	System.out.println("Enter Price of Part: ");
    	price=input.nextFloat();
    	System.out.println("Enter Quantity:");
    	quantity=input.nextInt();
    }
    void management()
    {
    	System.out.println("Enter Item Quantity you want: ");
    	n=input.nextInt();
    	stock=quantity-n;
    	if(n>4)
    	{
    		
    	}
    }
	public static void main(String[] args) 
	{
		
	}

}
