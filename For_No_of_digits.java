import java.util.*;
class For_No_of_digits 
{
	public static void main(String[] args) 
		{
	 int num,i,rev=0,rem,count=0;
     Scanner input=new Scanner(System.in);
     System.out.println("Enter number u want to entered : ");
     num=input.nextInt();
      int temp=num;
     while(num>0)
     {
    	 rem=num%10;
		 count++;
    	 rev=rev*10+rem;
    	 num=num/10;
    	 
     }
     System.out.println("Reverse No is :"+rev);
     System.out.println("No. of digits is : "+count);
     System.out.println("The Real no is which is entered by the user is :"+temp);
	}

}