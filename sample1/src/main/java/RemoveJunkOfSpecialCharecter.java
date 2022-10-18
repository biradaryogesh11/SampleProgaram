
public class RemoveJunkOfSpecialCharecter 
{
	public static void main(String arsg[])
	{
		String s="Yogesh Biradar @%@@%#&!@&* 111994";
	     s=s.replaceAll("[^a-zA-z0-9]", "");
	     System.out.println(s);
	}

}
