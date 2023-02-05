package hashMapConcept;

import java.util.HashMap;
import java.util.Iterator;

public class BasicOfHashMap 
{
	public static void main(String args[])
	{
        //  No order so no indexing
		// store value <key,value> format
		// Key can not be duplicate
		// It can have one null key and Multiple null value
		// HashMap is not sychronised not thread safe
		
	    HashMap<String, String> map=new HashMap<String, String>();
	    map.put("india" ,"new delhi");
	    map.put("us", "wdc");
	    map.put("uk", "london");
	    map.put(null, "france");
	    map.put("france", null);
	    map.put("china", "shghai");
	   
	    
	    // remove the value
	  //  map.remove("china");
	    System.out.println(map.get("china"));
	    System.out.println(map.get("uk"));
	    
	    //how to iterate has map
	    
	    Iterator<String> country = map.keySet().iterator();
	    
	    while(country.hasNext())
	    {
	    	    String nation = country.next();
	    	    System.out.println("key: "+nation+"  "+"  Value: "+map.get(nation));
	    }
	
	}
}
