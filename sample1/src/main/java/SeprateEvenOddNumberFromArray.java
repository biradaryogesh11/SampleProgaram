
public class SeprateEvenOddNumberFromArray
{

	public static void main(String args[])
	{
		int [] a= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("These are the even Number");
		for(int i=0;i<a.length;i++)
		{
			int mod=a[i]%2;

			if(mod==0)
			{
				//int add=a[i];

				System.out.println(a[i]);
			}
		}
		System.out.println("These are the odd Number");
		for(int i=0;i<a.length;i++)
		{
			int mod=a[i]%2;

			if(mod!=0)
			{
		//		int add=a[i];

				System.out.println(a[i]);
			}
		}

		///////////////////////////////////////////////////////////////////////////
		System.out.println("even");
		for(int value:a)
		{
			if(value%2==0)
			{
				System.out.println(value);
			}
		}
		System.out.println("odd");		
		for(int value:a)
		{
			if(value%2!=0)
			{
				System.out.println(value);
			}
		}

	}
}
