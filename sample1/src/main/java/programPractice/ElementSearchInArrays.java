package programPractice;

public class ElementSearchInArrays {

	public static void main(String[] args) 
	{
		int a[]= {10,3,4,7,8,2};
		int count=a.length;
		for(int i=0;i<count;i++)
		{
			for(int j=i+1;j<count;j++)
			{
				int add=a[i]+a[j];
				if(add==9)
				{
				    
					int f=a[i];
					int s=a[j];
					System.out.println(a);
					System.out.println();
				}
			}
		}

	}

}
