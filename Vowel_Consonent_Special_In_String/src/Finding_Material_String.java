import java.util.*;
public class Finding_Material_String 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		String s=new String();
		int Vowel_Count=0,Consonent_Count=0,Special_Character=0;
		System.out.println("Enter the String:- ");
		s=input.nextLine();
		char y[]=s.toCharArray();
		for(int i=0;i<=s.length()-1;i++)
		{
			if(y[i]>='a'&& y[i]<='z'||y[i]>='A'&&y[i]<='Z')
			{
				if(y[i]=='A' || y[i]=='a' || y[i]=='E' || y[i]=='e' || y[i]=='I' || y[i]=='i' || y[i]=='O' || y[i]=='o' || y[i]=='U' || y[i]=='u')
				{
					Vowel_Count++;
				}
				else
				{
					Consonent_Count++;
				}
			}
			else
			{
				Special_Character++;
			}
			
		}
		System.out.println("Given String is:- " +s);
		System.out.println("Vowel's are:- " +Vowel_Count);
		System.out.println("Consonent's are:-  "+Consonent_Count);
		System.out.println("Special Characters are:-  "+Special_Character);
		input.close();

	}

}
