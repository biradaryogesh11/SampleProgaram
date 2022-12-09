package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {

     
		ArrayList<String> list= new ArrayList<String>(Arrays.asList("yogesh","somesh","mangesh","Deepali"));
		
		// Typical for Loop
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("===========");
		
		// For each loop
		for(String s:list)
		{
			System.out.println(s);
		}
		System.out.println("===========");
		
	
		// Stream with Lambda
		//list.stream().forEach(ele  System.out.println(ele));
		System.out.println("===========");
		// using Iterator
		Iterator<String> names = list.iterator();
		
		while(names.hasNext());
		{
			System.out.println(names.next());
		}
		

	}

}
