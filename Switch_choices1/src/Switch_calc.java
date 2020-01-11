import java.util.*;
public class Switch_calc 
{

	public static void main(String[] args) 
	{
		Scanner input =new Scanner(System.in);
		System.out.println("Enter First no.: ");
		int a=input.nextInt();
		System.out.println("Enter Second no.: ");
        int b=input.nextInt();
        System.out.println("Enter your Choice:\n For Add Press-1 \n For Sub Press-2 \n For Mul Press-3 \n For Div Press-4");
        int choice=input.nextInt();
        switch(choice)
        {
        case 1:
        	int x =a+b;
        	System.out.println("Addition is "+x);
            break;
        case 2:	
        	int y = a-b;
        	System.out.println("Substraction is"+y);
        	break;
        case 3:
        	int z=a*b;
        	System.out.println("Multiplication is "+z);
        	break;
        case 4:
        	int n=a/b;
        	System.out.println("Division is"+n);
        	break;
        default:
        	System.out.println("Sorry!please choose valid option");
        	break;
        }
        
	}  
}


