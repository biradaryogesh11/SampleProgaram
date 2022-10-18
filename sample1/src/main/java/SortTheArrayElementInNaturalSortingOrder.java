import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortTheArrayElementInNaturalSortingOrder 
{
	public static void main(String args[])
	{
		int a[]= {30,20,40,50,10,60};
		
		System.out.println("List Before the sorting"+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("List After the sorting"+Arrays.toString(a));
		
//		OR
		
//		System.out.println("List Before the sorting"+Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println("List After the sorting"+Arrays.toString(a));
		
//		Decreasing Order
//		Integer a[]= {30,20,40,50,10,60};
//		
//		System.out.println("List Before the sorting"+Arrays.toString(a));
//		Arrays.sort(a,Collections.reverseOrder()); //Collections.reverseOrder()= Primitive datatype
//		                                           //are not supported we have to use derived type "Integer"
//		System.out.println("List After the sorting"+Arrays.toString(a));
		
	}

}
