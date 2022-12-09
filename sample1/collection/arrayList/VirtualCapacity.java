package arrayList;

import java.util.ArrayList;

public class VirtualCapacity 
{
	public static void main(String args[]){
	
	// default capacity of ArrayList is 10	
	ArrayList<Object> list= new ArrayList<Object>();
	
	list.add(100);
	System.out.println(list);

	list.add(200);
	list.add(300);
	System.out.println(list.size());
	

	}

}
