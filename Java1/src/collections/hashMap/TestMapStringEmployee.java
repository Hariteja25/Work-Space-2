package collections.hashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
  Map with string as key and employee obj as value
  - Add 4 employee obj ;
  	use put() method. 
  - get 
  - containsKey
  - remove 
  - print all , use entrySet() method.
  
  
 */
public class TestMapStringEmployee {
	public static void main(String[] args) {
		// Map with string as key and employee obj as value
		Map<String, Employee> map = new HashMap<>();

		// create 4 emp objs
		Employee e1 = new Employee("user1", 1, "pan1");
		Employee e2 = new Employee("user2", 2, "pan2");
		Employee e3 = new Employee("user3", 3, "pan3");
		Employee e4 = new Employee("user4", 4, "pan4");

		// keep the data in map
		map.put("user1", e1);
		map.put("user4", e4);
		map.put("user3", e3);
		map.put("user2", e2);
		
		// print all entries
		for (Entry<String, Employee> entry : map.entrySet()) {
			String key = entry.getKey();
			Employee emp = entry.getValue();
			System.out.println("key= " + key + " , value=" + emp);
			
			 Employee e5 =map.get("user1");// returns the employee obj
				System.out.println(e5.getId()); // 1
				System.out.println(e5.getName()); // user1
				System.out.println(e5.getPan()); //pan1
				
				Employee e6 =map.get("user10");// returns the null
				System.out.println("user 10 doesnt exists. so get method returns  : "+e6);
				
				System.out.println("***************contains key *****************************");
				System.out.println(map.containsKey("user1"));
				System.out.println(map.containsKey("user56"));

				System.out.println(" **********************Check remove() method::****************************************");
				map.remove("user1");  // removes user1 + e1 obj
				System.out.println(map.get("user1"));// returns null as key "user1" doesnt exists
			}
			}
		}

	


