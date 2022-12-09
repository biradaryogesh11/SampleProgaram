package javaInterviewProgramQuestion;

import java.util.Arrays;

public class JavaAnagramString {
	
	public static boolean anagram(String str,String str1 )
	
	{
		  String string = str.replaceAll("\\str", "");
		  String string1= str.replaceAll("\\str1","");
		  int l=string.length();
		  int l1=string1.length();
		  
		  if(l!=l1)
		  {
			  return false;
		  }
		  else
		  {
			  char []s=str.toLowerCase().toCharArray();
			  char []s1=str1.toLowerCase().toCharArray();
			  Arrays.sort(s);
			  Arrays.sort(s1);
			  return Arrays.equals(s, s1);
			  
		  }
	}

	public static void main(String[] args) {
		
		System.out.println(JavaAnagramString.anagram("Listen", "Silent")) ;

	}

}
