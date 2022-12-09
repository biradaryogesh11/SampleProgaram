package javaInterviewProgramQuestion;

public class RemoveTheSpacesBetweenTheWord {

	public static void main(String[] args) {
		
		String s= "i am yogesh biradar" 
				+"\n java course";
		String str="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
			{
				str=str+ch;
			}
			
		}
		System.out.println(str);
	}

}
