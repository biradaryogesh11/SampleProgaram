package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		
	ArrayList<Object>  list= new ArrayList<Object>();	
	list.add(100);
	list.add("yogesh");
	list.add('r');
	list.add(200);
	System.out.println(list);
	System.out.println(list.get(2));
	System.out.println(list.get(0));
	
	//Find outthe size of array list
	
	System.out.println(list.size());
 
	list.add("mangesh");
	list.add("somesh");
	System.out.println(list.size());

	// List with other collection
	ArrayList<Integer> list2= new ArrayList<Integer>(Arrays.asList(10,20,30,40));
	System.out.println(list2);
	
	ArrayList<String> list3= new ArrayList<String>(Arrays.asList("yogesh","mangesh","somesh","deepali"));
	System.out.println(list3);
	}

}
