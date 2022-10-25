
public class FindVowelInString 
{
	public static void main(String args[])
	{
	String s="welcome";
	  char[] s1 = s.toCharArray();
	 int count=s1.length;
	 int vow=0;
	 
	 for(int i=0;i<count;i++)
	 {
//		 char ch= s.charAt(i);
//		char  ch=s1[i];
//		System.out.println(ch);
		 if(s1[i]=='a'||s1[i]=='e'||s1[i]=='i'||s1[i]=='o'||s1[i]=='u'||s1[i]==0)
		 {
			 vow++;
			 s1[i]=0;
			 System.out.println(s1[i]);
		 }
		
	 }
	
	 System.out.println(vow++);
	
	}

}
