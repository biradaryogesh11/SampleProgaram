package programPractice;

public class HowToPrintNumber1To100 {

	public static void main(String[] args) 
	{
		int a= 'A'/'A';
		String s= "..........";
		int l=s.length();
		
//		for(int i=a;i<=l*l;i++)
//		{
//			System.out.println(i);
//		}
		  printNum(1,100);

	}
	public static void printNum(int start,int end)
	{
		if(start<=end)
		{
			System.out.println(start);
			start++;
			printNum(start,end);
		}
	}
	

}
