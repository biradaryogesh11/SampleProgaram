package javaInterviewProgramQuestion;

public class ConvertStringIntoInteger {
	
	public static int conver(String num)
	{
     int l=num.length();
     int count=0;
     
     for(int i=0;i<l;i++)
     {
          count =count*10+((int) num.charAt(i)-48);
          
     }  
		System.out.println(count);
		return count;
	}
	

	public static void main(String[] args) {
		
		String s="123";
		System.out.println(ConvertStringIntoInteger.conver(s)+10);
		
      
	}

}
