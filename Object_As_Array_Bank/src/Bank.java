import java.util.*;
public class Bank 
{   private String name;
	private int acno;
	private float bankbal,amt,depo,withd;
	Scanner input=new Scanner(System.in);
	void get_bank_detail()
	{   System.out.println("Enter your name: ");
	    name=input.nextLine();
		System.out.println("Enter Your Account Number: ");
		acno=input.nextInt();
		System.out.println("Enter Bank balance:  ");
		bankbal=input.nextFloat();
		
	}
	void bank_management()
	{
		System.out.println(" Welcome to Bank");
		System.out.println("1.Show Your Account Balance");
		System.out.println("2.Deposite Money ");
		System.out.println("3.Withdrawl Money");
		int ch=input.nextInt();
		switch(ch)
		{
		case 1:
			System.out.print("BankBalance"+bankbal);
			break;
		case 2:
			System.out.println("Deposite Money:");
			depo=input.nextFloat();
			bankbal=bankbal+depo;
			System.out.println(bankbal);
			break;
		case 3:
			System.out.println("Withdrawl Money:");
			withd=input.nextFloat();
			if(withd>bankbal)
			{
				System.out.println("Invalid amount");
			}
			else
			{
			bankbal=bankbal-withd;
			System.out.println(bankbal);
			}
			break;
			
		default :
			System.out.println("You enter invalid");
			break;
		}
	}

	public static void main(String[] args) 
	{ Scanner input=new Scanner(System.in);
	  System.out.println("Enter Numbers of Bank Users:");
	  int n=input.nextInt();
	  Bank b[]=new Bank[n];
	  for(int i=0;i<b.length;i++)
	  {
		  b[i]=new Bank();
		  b[i].get_bank_detail();
		  b[i].bank_management();
	  }
	}

}
