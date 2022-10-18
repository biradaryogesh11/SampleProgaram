
public class ReverseEachWordInString 
{
   public static void main(String args[])
   {
	   String s="My name is yogesh biradar";
	   String[] word = s.split(" ");
	   String reversestring="";
	   
	   for(String w:word)
	   {
		   int l = w.length();
		   String reverseword="";
		   
		   for(int i=l-1;i>=0;i--)
		   {
			   reverseword=reverseword+w.charAt(i);
		   }
		   reversestring=reversestring+reverseword+" ";
	   }
	   System.out.println(reversestring);
	   
	   for(String w1:word)
	   {
		   StringBuilder sb= new StringBuilder(w1);
		    sb.reverse();
		     reversestring=reversestring+sb.toString()+" ";
	   }
	   System.out.println(reversestring);
	   
   }
}
