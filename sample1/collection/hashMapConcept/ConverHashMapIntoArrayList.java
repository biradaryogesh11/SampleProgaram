package hashMapConcept;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import java.util.Set;

public class ConverHashMapIntoArrayList {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map= new HashMap<Integer,String>();
		map.put(1, "yogesh");
		map.put(2, "mangesh");
		map.put(3, "somesh");
		
		Set<Integer> map1 = map.keySet();
		
		ArrayList<Integer> list= new ArrayList<Integer>(map1);
		System.out.println(list);
		Collection<String> list2 = map.values();
		ArrayList<String> list3= new ArrayList<String>(list2);
		System.out.println(list3);
		 

	}

}
