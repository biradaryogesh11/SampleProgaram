package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateElementInArrayList {

	public static void main(String[] args) {

       
		ArrayList<Integer> number= new ArrayList<Integer>(Arrays.asList(1,2,3,2,4,5,4,6,5,7,8,9));
		
		HashSet<Integer> list= new HashSet<Integer>(number);
		
		ArrayList<Integer> withoutDuplicatenumber= new ArrayList<Integer>(list);
		System.out.println(withoutDuplicatenumber);
		

	}

}
