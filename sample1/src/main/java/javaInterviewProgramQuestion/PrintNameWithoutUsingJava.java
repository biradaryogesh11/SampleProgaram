package javaInterviewProgramQuestion;

public class PrintNameWithoutUsingJava {

	public static void main(String[] args) {
		
		String str="yogesh";
		String s="i";
	
	
		s=s.replaceAll("i", "iiiiiiiiii");
		s=s.replaceAll("i", "iiiiiiiiii");
		s=s.replaceAll("i", "iiiiiiiiii");
		s=s.replaceAll("i", str+"\n");
		System.out.println(s);
		
		
	}

}
