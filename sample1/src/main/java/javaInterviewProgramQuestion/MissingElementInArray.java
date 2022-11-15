package javaInterviewProgramQuestion;

public class MissingElementInArray {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,5};
		int add=0;
		for(int b:a)
		{
			 add=add+b;
		}
		System.out.println(add);
		
		int a1[]= {1,2,3,4,5};
		int add1=0;
		for(int b1:a1)
		{
			add1=add1+b1;
		}
		System.out.println(add1);
		System.out.println("Missing number :"+(add1-add));
		
	}

}
