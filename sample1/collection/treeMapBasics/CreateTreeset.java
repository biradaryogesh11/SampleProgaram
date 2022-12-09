package treeMapBasics;

import java.util.TreeMap;

public class CreateTreeset {

	public static void main(String[] args) {

		// Use Tree Map when you need comparison
		TreeMap<Integer,String> map= new TreeMap<>();
		map.put(2000, "pune");
		map.put(1500, "mumbai");
		map.put(3500, "banglore");
		map.put(2700, "delhi");
		
		System.out.println(map); 
		
		// To get below key Value
		System.out.println(map.headMap(3500));
		// to get equal to above key value 
		System.out.println(map.tailMap(1500));
		// 
        
		


	}

}
