package programPractice;

public class FindMaxMinNumber {

	public static void main(String[] args) {
		
		int b[]= {3,7,9,4,11,17};
		int max=b[0];
		int min=b[0];
		
		int l=b.length;
		
		for(int i=0;i<l;i++)
		{
			if(b[i]<min)
			{
				max=b[i];
				
			}
			
		}
		System.out.println(max);
	}

}
