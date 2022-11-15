package programPractice;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) 
	{
		int a[]= {1,5,3,7,12,11};
		
		int l=a.length;
		
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l;j++)
			{
				if(a[j]>a[i])
				{
					int max=a[j];
					  a[j]=a[i];
					  a[i]=max;
				}
			}
			
		}
		System.out.println(Arrays.toString(a));
		
		

	}

}
