
public class StringProgram 

{  
//	f
//	fu
//	fun
//	un
//	n
	
	
	
	public static void main(String  args[]) throws InterruptedException
	{
		
		String s="fun";
		
		String sum="";
		  int count = s.length();
		 
		
		     for(int i=0;i<count;i++)
			{
				char ch= s.charAt(i);
				sum= sum+ch;
				System.out.println(sum);
			}
			  for(int j=1;j<count;j++)
				{
				  String add="";
				  for(int i=0+j;i<count;i++)
				  {
					  
					char ch= s.charAt(i);
					 add=add+ch; 
					
				  }
				  System.out.println(add);
				 }
			  
			  
			  
			
	}

}
