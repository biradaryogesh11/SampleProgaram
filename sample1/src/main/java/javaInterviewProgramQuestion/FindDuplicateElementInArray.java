package javaInterviewProgramQuestion;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementInArray {

	public static void main(String[] args) 
	{
	   String s[]= {"yogesh","mangesh","somesh","deepak","yogesh","somesh","yogesh"};
	   int l=s.length;
	   for(int i=0;i<l;i++)
	   {
		   for(int j=i+1;j<l;j++)
		   {
			   if(s[i]==s[j] && s[i]!=" ")
			   {
				   
				   System.out.println(s[i]);
				   s[i]=" ";
				   s[j]=" ";
				  
			   }
		   }
	   }
	   
	   /* Another Way
	    
	   */
//	   Set<String> h= new HashSet<String>();
//	   
//	   for(String s1:s)
//	   {
//		   boolean data = h.add(s1);
//		   if(data==false)
//		   {
//			  System.out.println(s1); 
//		   }
//	   }
	   
	   

	}

}
