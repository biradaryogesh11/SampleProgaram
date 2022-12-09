package javaInterviewProgramQuestion;

public class FindTheLeadersNumber {
	
	public static void leadernumber(int num[])
	{
		int max=num[num.length-1];
		System.out.print(max+" ");
		for(int i=num.length-2;i>=0;i--)
		{
			if(num[i]>max)
			{
				System.out.print(num[i]+" ");
				max=num[i];
			}
		}
		
	}

	public static void main(String[] args) {
		
		int num[]= { 20,10,15,8,6,3};
		FindTheLeadersNumber.leadernumber(num);

	}

}
