package linkedHashMapBasics;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class CreateLinkedHashMap {

	

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> map= new LinkedHashMap<Integer,String>();
		map.put(1, "pune");
		map.put(2, "mumbai");
		map.put(3, "banglore");
		map.put(4, "delhi");
		System.out.println(map);
		
		System.out.println(map.get(2));
		Set<Integer> map_key = map.keySet();
		System.out.println(map_key);
		 Collection<String> map_value = map.values();
		System.out.println(map_value);
		
		Iterator<Integer> map1 = map.keySet().iterator();
		
		while(map1.hasNext())
		{
			 Integer key = map1.next();
			String value = map.get(key);
			System.out.println("key: "+key+" values: "+value);
		}

	}

}
