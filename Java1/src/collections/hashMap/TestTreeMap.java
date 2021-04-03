package collections.hashMap;
/*
 * Req:
- Create Treemap with string as key ,string as value.
- add entries inside the map
- show the entries
 
 
 TreeMap : maintains sorting order on key.
 
 */

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		System.out.println("************** TreeMap ********************");
		
		Map<String, String> map = new TreeMap<>();
		
		map.put("129", "user2");
		map.put("132", "abcd");
		map.put("128", "user1");
		map.put("133", "user6");
		map.put("130", "user3");
		map.put("131", "user4");

		//use map.entrySet() for iterating the map
		// map.entrySet() -> return entry objects.
		//every entry obj has key and value 
		for (Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key === " + key + "  value ==" + value);
	}

	}
}



