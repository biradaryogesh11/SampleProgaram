
public class ElementSearchInArray 
{
	public static void main(String args[])
	{
		int a[]= {4,8,10,6,14};
		
		int b=10;
		int l= a.length;
		boolean status=false;
		for(int i=0;i<l;i++)
		{
			if(a[i]==b)
			{
			    status=true;
				System.out.println(a[i]);
				break;
			}
		}
		if(status==false)
		{
			System.out.println("No. not prasent in array");
		}
		
	}

}
