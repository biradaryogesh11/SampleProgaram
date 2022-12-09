package linkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CreateLinkedListClass {

	public static void main(String[] args) {
		
		LinkedList<String> list= new LinkedList<String>();
		list.add("yogesh");
		list.add("somesh");
		list.add("mangesh");
		list.add("nitin");
		
		// Size method
		System.out.println(list.size());//4

		// how to iterate LL
		Iterator<String> names=list.iterator();
		
		while(names.hasNext())
		{
			System.out.println(names.next());
		}
		// add method
		list.add("sachin");
		list.add("deepak");
		System.out.println(list);
		
		// add the value to the first node
		
		list.addFirst("suvarna");
		
		// add the value to the last node
		list.addLast("Deepali");
		System.out.println(list);
        
		LinkedList<String> list2= new LinkedList<String>();
		list2.add("aditya");
		list2.add("swara");
		
		list.addAll(list2);
		System.out.println(list);
		
		// Reverse ArrayList
		Iterator<String> names2=list.descendingIterator();
		while(names2.hasNext())
		{
			System.out.println(names2.next());
		}
		// Remove from array list
		list.remove(0);
		System.out.println();
		
		//Sort method
		Collections.sort(list);
		System.out.println(list);
		
		// RemoveAll method
		list.removeAll(list2);
		System.out.println(list);
	}

}
