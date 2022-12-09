package hashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcept {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		// Set doesn't allow duplicate element
		HashSet<String> set = new HashSet<String>();
		set.add("pune");
		set.add("mumbai");
		set.add("Nashik");
		set.add("pune");

		System.out.println(set);
		// size of set
		System.out.println(set.size());
		// contains method
		System.out.println(set.contains("Nashik"));
		// How to iterate
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("======================");
		// Using Iterator concept

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		set.add("abc");
		// remove method
		set.remove("abc");
		System.out.println(set);
		System.out.println("======================");
		HashSet<Integer> value = new HashSet<Integer>(Arrays.asList(1,2,4,6,8,9,10));
		HashSet<Integer> value2 = new HashSet<Integer>(Arrays.asList(1,3,4,5,6,7,8,10));
		
		value.addAll(value2);
		System.out.println(value);
		System.out.println("======================");
		// find the common svalue(Union values)
		value.retainAll(value2);
		System.out.println(value);
		
		
		
		
		
	}

}
