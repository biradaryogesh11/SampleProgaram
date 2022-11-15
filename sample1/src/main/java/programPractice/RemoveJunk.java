package programPractice;

public class RemoveJunk {

	public static void main(String[] args) 
	{
		String s="hi yogesh&&**@@### biradar";
		
		String s1=s.replaceAll("[^a-z,A-Z,0-9]", "");
		System.out.println(s1);
 
	}

}
