
public class MissingNumberInArray 
{
	public static void main(String args[])
	{
		int a[]= {1,2,4,5};
		
		   int l = a.length;
		   int sum=0;
		   int sum1=0;
		  for(int i=0;i<l;i++)
		  {
			  sum=sum+a[i];
		  }
		  System.out.println(sum);
		  for(int i=1;i<=5;i++)
		  {
			  sum1=sum1+i;
		  }
		  System.out.println(sum1);
		  System.out.println("Missing number in array"+(sum1-sum));
	}

}
