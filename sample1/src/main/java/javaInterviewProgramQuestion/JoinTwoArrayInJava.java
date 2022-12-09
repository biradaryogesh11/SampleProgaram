package javaInterviewProgramQuestion;

import java.util.ArrayList;

public class JoinTwoArrayInJava {

	public static void main(String[] args) 
	{
		String str[]= {"aditya","sarthak","Shivam"};
		String str1[]= {"radha","samruddhi","swara"};
		String sb="";
		ArrayList list= new ArrayList();
	      
		for(String sib:str)
		{
			list.add(sib);
//			String sibling ="";
//			sibling=sibling+sib +" ";
//			System.out.println(sibling);
//			sb=sb+sibling;
		}
		
		for(String sib1:str1)
		{
			list.add(sib1);
//			String sibling ="";
//			sibling=sibling+sib1 +" ";
//			System.out.println(sibling);
//			sb=sb+sibling;
		}
		System.out.println(list);
		System.out.println();
		
       
	}

}
