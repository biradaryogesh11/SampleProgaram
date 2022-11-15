package javaInterviewProgramQuestion;

public class DuplicateCharecter {

	public static void main(String [] args) 
	{

		String s="my name";
		
		char[] s1 = s.toCharArray();
		System.out.println(s1);
		int l= s1.length;
		System.out.println(l);
		int add=0;
		for(int i=0;i<l;i++)
		{
			
			add=1;
			for(int j=i+1;j<l;j++)
			{
			    if(s1[i]==s1[j]&& s1[i]!='0')
				{
					add++;
					
					s1[j]='0';
				}
			}
			if(add>=1&&s1[i]!='0'&&s1[i]!=' ')
			{
				System.out.println(s1[i]);
				System.out.println(add);
			}
			
			
			
		}


	}

}
