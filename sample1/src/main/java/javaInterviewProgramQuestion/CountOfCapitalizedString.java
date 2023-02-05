package javaInterviewProgramQuestion;

public class CountOfCapitalizedString {

	public static void main(String[] args) {
		
		String str="My Name Is Yogesh Biradar";
		
	    int l=str.length();
	    int count=0;
	    int count1=0;
	    for(int i=0;i<l;i++)
	    {
	    	   char ch = str.charAt(i);
	    	   if(ch>='A' &&ch<='Z')
	    	   {
	    		   count++;
	    	   }
	    	   if(ch>='a' &&ch<='z')
	    	   {
	    		   count1++;
	    	   }
	    }
	    System.out.println("capital letter : "+count);
	    System.out.println("small letter : "+count1);

	}

}
