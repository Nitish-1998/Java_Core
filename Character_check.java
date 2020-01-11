import java.util.*;
class  Character_check
{
	public static void main(String[] args) 
	{char n;
	 Scanner input=new Scanner(System.in);
	 System.out.println("Enter the Character you want to check:-");
	 n=input.next().charAt(0);
	 if(n=='A' || n=='a' || n=='E' || n=='e' || n=='I'  || n=='i' || n=='O'
	 || n=='o' || n=='U' || n=='u')
	 { 
		 System.out.println("It is Vowel");
     }
	 else
	 {
		 System.out.println("It is consonent");
	 }
	}
}
