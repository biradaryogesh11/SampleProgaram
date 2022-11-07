package programPractice;

import java.util.Arrays;

public class ArraySortingWithBubbleApproch 
{

	public static void main(String args[])
	{
	    int a[]= {34,27,31,35,27};
	    int count = a.length;
	   
	    for(int i=0;i<count-1;i++)
	    {
	    	for(int j=0;j<count-1;j++)
	    	{
	    		if(a[j]>a[j+1])
	    		{
	    			int temp=a[j];
	    			a[j]=a[j+1];
	    			a[j+1]=temp;
	    		}
	    	}
	    	 
	    }
	    System.out.println(Arrays.toString(a));
	    	
	}
	
}
