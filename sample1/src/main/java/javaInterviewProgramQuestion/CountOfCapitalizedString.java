package javaInterviewProgramQuestion;

public class CountOfCapitalizedString {

	public static void main(String[] args) {
		
		String str="My Name Is Yogesh Biradar";
		
	    int l=str.length();
	    int count=0;
	    
	    for(int i=0;i<l;i++)
	    {
	    	   char ch = str.charAt(i);
	    	   if(ch>='A' &&ch<='Z')
	    	   {
	    		   count++;
	    	   }
	    }
	    System.out.println(count);

	}

}
