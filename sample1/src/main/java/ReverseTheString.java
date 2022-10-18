
public class ReverseTheString 
{
	public static void main(String args[])
	{
         
	  String s ="my name is yogesh";
	  String[] s1 = s.split(" ");
	     int l = s1.length;
	//  System.out.println(l);
	  String rev="";
	  
	  for(int i=l-1;i>=0;i--)
	  {
		  rev=rev+s1[i]+" ";
	  }
	     System.out.println(rev);
	     
	
	}
}
