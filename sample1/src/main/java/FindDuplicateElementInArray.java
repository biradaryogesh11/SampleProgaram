
public class FindDuplicateElementInArray
{
	
	public static void main(String args[])
	{
		int a[]= {10,20,30,10,20,40,60,40, 20, 30};
		int count = 0;
					
		for(int i=0;i<a.length;i++)
		{
			count=1;
			for(int j=i+1;j<a.length;j++)
			{
				
		        if(a[i]==a[j] && a[i]!=0 )
		        {
		        	count++;
		        	a[j]=0;
		          	
		        }
			}
			if (count>1 && a[i]!=0)
			{
				System.out.println(a[i]);
				System.out.println(count);
			}
		}
		
		
		
	}

}
