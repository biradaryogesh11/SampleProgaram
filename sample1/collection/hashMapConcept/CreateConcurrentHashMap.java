package hashMapConcept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CreateConcurrentHashMap {

	public static void main(String[] args) {
		
		//Create Synchronised Map
		HashMap<Integer,String> map= new HashMap<Integer,String>();
		map.put(1, "yogesh");
		map.put(2, "mangesh");
		map.put(3, "somesh");
		Map<Integer,String>map1=Collections.synchronizedMap(map);
		System.out.println(map1);
        
		// Create ConcurrentHashMap
		ConcurrentHashMap<Integer,String> concurrent= new ConcurrentHashMap<Integer,String>();
		concurrent.put(1, "yogesh");
		concurrent.put(2, "mangesh");
		concurrent.put(3, "somesh");
		
		System.out.println(concurrent);
		System.out.println(concurrent.get(2));
		
	}

}
