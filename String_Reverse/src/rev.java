public class rev 
{

	public static void main(String[] args) 
	{
		String x="too Hot To Hoot";
		x=x.replace(" ","");
		x=x.toLowerCase();
	       char y[]=x.toCharArray();
	       int size=y.length;
	       char c[]=new char[size];
	       int i=0;
	       while(i!=size)
	       {
	           c[size-1-i]=y[i];
	           i++;
	            
	       }
	       System.out.println(y);
         System.out.println(c);
         for(int j=0;j<size;j++)
         {
        	 if(y[j]==c[j])
             {
            	 continue;
             }
             else 
             {
            	System.out.println("Not palindrome"); 
            	System.exit(0);
             }

         }
         System.out.println("Palindrome");
         
	}

}
