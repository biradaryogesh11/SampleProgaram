package javaInterviewProgramQuestion;

import java.util.StringJoiner;

public class JavaStringJoinerClass {

	public static void main(String[] args) {
		
		StringJoiner str= new StringJoiner(",","[","]");
		str.add("yogesh");
		str.add("somesh");
		str.add("mangesh");
		System.out.println(str.toString());

	}

}
