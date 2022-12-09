package arrayList;

import java.util.ArrayList;

public class CommonMethosOnArrayList {

	public static void main(String[] args) {

		ArrayList<String> list= new ArrayList<String>();
		list.add("swara");
		list.add("radha");
		list.add("samruddhi");
		list.add("Aditya");
		list.add("sarthak");

		ArrayList<String> list1= new ArrayList<String>();
		list1.add("yogesh");
		list1.add("yogesh");
		list1.add("yogesh");
		

		//  Add one array list to another list
		
//		list.addAll(list1);
//		System.out.println(list);
//		
//		// Add list in middle of arrayList
//		
//		System.out.println(list.addAll(1,list1));
		
		// IndexOfMethod it return at what position in arrayList 
		
	   System.out.println((list.indexOf("radha")>0));
	   int count = list.lastIndexOf("radha");
	   System.out.println(count);
	   
	   // remove method 
	   System.out.println(list.remove(3));
	   //remover method by value
       System.out.println(list.remove("sarthak"));		
       
       
       
       
	}

}
