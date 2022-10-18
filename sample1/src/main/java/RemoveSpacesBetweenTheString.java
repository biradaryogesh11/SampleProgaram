
public class RemoveSpacesBetweenTheString {

	public static void main(String[] args) 
	{
		String s="Yogesh       Govindrao              Biradar";
		s=s.replaceAll(" \\s ", "");
		System.out.println(s);
		
	}
}
