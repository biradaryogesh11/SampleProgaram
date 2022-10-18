import java.util.Arrays;

public class BubbleSortingOfArray 
{

	
	public static void main(String args[])
	{
		int b[]= {24,23,27,25,29};
		
		int l = b.length;
		
	for(int i=0;i<l-1;i++)
	{
		   for(int j=0;j<l-1;j++)
		   {
			  if(b[j]>b[j+1])
			  {
				  int temp=b[j];
				  b[j]=b[j+1];
				  b[j+1]=temp;
			  }
		   }
		   
	}
	System.out.println(Arrays.toString(b));
	}
}
