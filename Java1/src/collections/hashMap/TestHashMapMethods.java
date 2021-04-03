package collections.hashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestHashMapMethods {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		System.out.println("*************Added map entries****************");
		map.put("128", "user1"); // 128 is key , "user1" is value
		map.put("129", "user2"); // 129 is key ,  "user2" is value 
		print(map); 
		
		//check if the key 128 exists
		boolean b1 = map.containsKey("128");
		System.out.println("key 128 status    : " + b1);
		
		//check if the key 128 exists
		boolean b2 = map.containsKey("131");
		System.out.println("key 131 status    : " + b2);
		
		//check if the Value user2 exists
		boolean b3 = map.containsValue("user2");
		System.out.println("value user2  status  : "+ b3);
		
		//get value for given key: 128
		String v1 = map.get("128");
		System.out.println("for key 128 , value  = " + v1);
		
		String v2 = map.get("134"); // key doesn't exist so return null
		System.out.println("for key 134 , value  = " + v2);
		
		System.out.println("*************Print only Keys****************");
		// to fetch all the keys
		for(String s: map.keySet()) {
			System.out.println(s);	
		}
		
		
		System.out.println("*************Print only VALUES****************");
		//  to fetch all the values
		for(String s: map.values()) {
			System.out.println(s);	
		}
		 
		//GET THE length of map
		int size = map.size();
		System.out.println("size = "+size);
		
		
		//remove the entry
		System.out.println("************removed 128***********************");
		map.remove("128"); // this will remove both key and value ;
		                  //"128", "user1" is deleted from map
		//GET THE length of map
		size = map.size();
		System.out.println("size= "+size);
		
		System.out.println("************is empty check***********************");
		boolean empty = map.isEmpty();
		System.out.println("map status :"+empty);
		
		map.clear(); // deletes all entries 
		System.out.println("map status :"+map.isEmpty());
	}

	private static void print(Map<String, String> map) {
		System.out.println("***************showing map entries*************************");
		for (Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key === " + key + "  value =="
					+ value);
		}
	}
}
 
