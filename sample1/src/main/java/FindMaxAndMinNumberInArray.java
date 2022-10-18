
public class FindMaxAndMinNumberInArray 
{

	public static void main(String args[])
	{
		int a[]= {13,9,7,11,15};
		int max=a[0];
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("this is max number :"+max);
		System.out.println("this is min number :"+min);
	}
	
}