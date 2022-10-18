
public class AdditionOfArray 
{

	public static void main(String args[])
	{
		int [] a= {5,7,3,2,3};
		int sum=0;
		

		//		for(int i=0;i<a.length;i++)
		//		{
		//			sum=sum+a[i];
		//			System.out.println(sum);
		//		}
		for(int b:a)
		{
			sum=sum+b;
			System.out.println(sum);
		}
		//	System.out.println(sum);
	}
}
