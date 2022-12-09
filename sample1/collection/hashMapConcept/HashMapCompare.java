package hashMapConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapCompare {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map1= new HashMap<Integer,String>();
		map1.put(1,"a");
		map1.put(2,"b");
		map1.put(3,"c");
		
		HashMap<Integer,String> map2= new HashMap<Integer,String>();
		map2.put(1,"a");
		map2.put(2,"b");
		map2.put(3,"c");
		
		HashMap<Integer,String> map3= new HashMap<Integer,String>();
		map3.put(1,"a");
		map3.put(2,"b");
		map3.put(3,"c");
		map3.put(4,"d");
		
		// comparison between to hash map with object reference
		//  "\n"==> NextLine
		System.out.print(map1.equals(map2)+"\n");//true
		System.out.println(map1.equals(map3));// false
		
		// compare HashMap using Key
		 
		Set<Integer> map1_key = map1.keySet();
		Set<Integer> map2_key = map2.keySet();
		Set<Integer> map3_key = map3.keySet();
		
		System.out.println(map1_key.equals(map2_key));//true
		System.out.println(map1_key.equals(map3_key));//false
		
		// Finding the Extra Key
		HashMap<Integer,String> map4= new HashMap<Integer,String>();
		map4.put(1,"a");
		map4.put(2,"b");
		map4.put(3,"c");
		
		HashMap<Integer,String> map5= new HashMap<Integer,String>();
		map5.put(1,"a");
		map5.put(2,"b");
		map5.put(4,"c");
		
		HashMap<Integer,String> map6= new HashMap<Integer,String>();
		map6.put(1,"a");
		map6.put(2,"b");
		map6.put(3,"c");
		map6.put(4,"c");
		
		HashSet<Integer> combine = new HashSet<Integer>(map4.keySet());
		combine.addAll(map6.keySet());
		combine.removeAll(map4.keySet());
		System.out.println(combine);//[d]
		
		// Duplicate are not  Allowed using array list
		
		System.out.println(new ArrayList<>(map4.values()).equals(new ArrayList<>(map5.values())));//true
		System.out.println(new ArrayList<>(map4.values()).equals(new ArrayList<>(map6.values())));// false
		
		// Duplicate are Allowed using hashSet
		
		System.out.println(new HashSet<>(map4.values()).equals(new HashSet<>(map5.values())));
		System.out.println(new HashSet<>(map4.values()).equals(new HashSet<>(map6.values())));
		
	}

}
