package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		
		// Comparison between two list
		ArrayList<String> list=new ArrayList<String>(Arrays.asList("a","b","c","d","e"));
		ArrayList<String> list1=new ArrayList<String>(Arrays.asList("a","e","c","d","b"));
		// first sort the both list
		Collections.sort(list);
		Collections.sort(list1);
		// Use equals method
		System.out.println(list.equals(list1));
		
		// Compare two ArrayList: find out different element in array
		
		ArrayList<String> ele=new ArrayList<String>(Arrays.asList("a","b","c","d","e"));
		ArrayList<String> ele1=new ArrayList<String>(Arrays.asList("a","b","c","d","f"));
		
//		ele.removeAll(ele1);
//		System.out.println(ele);
		
		ele1.removeAll(ele);
		System.out.println(ele1);

		// Common element between two arrays
		
		ArrayList<String> sib=new ArrayList<String>(Arrays.asList("swara","samruddhi","radha","sarthak"));
		ArrayList<String> sib1=new ArrayList<String>(Arrays.asList("swara","samruddhi","radha","aditya"));
		
		sib.retainAll(sib1);
		System.out.println(sib);
	}

}
