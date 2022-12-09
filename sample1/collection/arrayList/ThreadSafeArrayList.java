package arrayList;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeArrayList {

	public static void main(String[] args) {
		
		// The thread safe array list
		
		CopyOnWriteArrayList<String> list= new CopyOnWriteArrayList<String>();
		
		list.add("swara");
		list.add("radha");
		list.add("samruddhi");
		System.out.println(list);
		
		Iterator<String> names=list.iterator();
		
		while(names.hasNext())
		{
			System.out.println(names.next());
		}

	}

}
