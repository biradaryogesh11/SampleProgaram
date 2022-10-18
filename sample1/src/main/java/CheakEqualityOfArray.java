
public class CheakEqualityOfArray 
{
	public static void main(String args[])
	{
		int a[]= {1,2,3,5,6};
		int b[]= {1,2,3,5,6,7};
		int l1 = a.length;
		int l2 = b.length;
		
		boolean status=true;
		
		if(l1==l2)
		{
			for(int i=0;i<l1;i++)
			{
				 if(a[i]!=b[i])
				 {
					 status=false;
				 }
			}
			
		}
		else
		{
			status=false;
		}
		if(status==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		
		
		
	}

}
