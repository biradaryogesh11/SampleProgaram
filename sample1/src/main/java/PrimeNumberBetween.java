
public class PrimeNumberBetween 
{
	
	public static void main(String arsg[])
	{
		
		for(int i=1;i<=1000;i++)
		{
			int count=0;
			for(int j=1;j<=1000;j++)
			{
				int mod= i%j;
				
				if(mod==0)
				{
				   count++;
				  
			     }
				
			}
			if(count==2)
			{
				System.out.print(i+",");
			}
			
		
		}
	}

}
