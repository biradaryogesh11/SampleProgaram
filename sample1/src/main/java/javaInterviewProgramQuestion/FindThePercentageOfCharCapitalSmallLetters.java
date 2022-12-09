package javaInterviewProgramQuestion;

public class FindThePercentageOfCharCapitalSmallLetters {

	public static void percentage(String str)
	{
		int l=str.length();
		int lowercase_count=0;
		int uppercase_count=0;
		int digit_count=0;
		int special_char=0;
		
		for(int i=0;i<l;i++)
		{
			char ch=str.charAt(i);
			if(Character.isLowerCase(ch))
			{
				lowercase_count++;
			}
			else if(Character.isUpperCase(ch))
			{
				uppercase_count++;
			}
			else if(Character.isDigit(ch))
			{
				digit_count++;
			}
			else 
			{
				special_char++;
			}
			}
		double lowercasepercent  = (lowercase_count*100.0)/l;
		double uppercasepercent  = (uppercase_count*100.0)/l;
		double digitpercent      = (digit_count*100.0)/l;
		double specialcharpercent  = (special_char*100.0)/l;
		System.out.println(lowercasepercent);
		System.out.println(uppercasepercent);
		System.out.println(digitpercent);
		System.out.println(specialcharpercent);
	    
	}
	public static void main(String[] args) {

		String str="Y9421366179b@";
		FindThePercentageOfCharCapitalSmallLetters.percentage(str);
	}

}
