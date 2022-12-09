package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericArrayList {

	public static void main(String[] args) {

        // Integer arrayList
		ArrayList<Integer> list= new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(list);
		
		// String ArrayList
		ArrayList<String> list1= new ArrayList<String>();
		list1.add("yogesh");
		list1.add("yogesh");
		list1.add("yogesh");
		list1.add("yogesh");
		System.out.println(list1);
		
		// Double ArrayList
       		
		ArrayList<Double> list2= new ArrayList<Double>();
		list2.add(100.1);
		list2.add(100.1);
		list2.add(100.1);
		list2.add(100.1);
		System.out.println(list2);
		
		
		
		

	}

}
