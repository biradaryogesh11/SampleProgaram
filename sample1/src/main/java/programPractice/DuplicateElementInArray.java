package programPractice;

public class DuplicateElementInArray {

	public static void main(String[] args) 
	{
		int b[]= {2,4,6,7,9,5,5,4};
		int l=b.length;
		int count;
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				count=1;
				if(b[i]==b[j]&&b[j]!=0)
				{
					count++;
					b[j]='0';
				}
				if(count>1&&b[i]!=0)
				{
					System.out.println(b[i]);
					System.out.println(count);
				}
			}
			
			
		}
		
	}

}
