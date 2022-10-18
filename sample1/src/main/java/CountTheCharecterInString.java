
public class CountTheCharecterInString 
{
	public static void main(String args[])
	{
		String s="yogesh govindrao biradar";
		
		int before = s.length();
		String s1 = s.replaceAll("o", "");
	      int after = s1.length();
	      
	      System.out.println("count Of charecter o: "+(before-after));
	}

}
