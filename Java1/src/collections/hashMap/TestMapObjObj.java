package collections.hashMap;
/*
 Map with Employee obj as key and Project obj as value.

  
  - Add 4 entries;
  - get()
  - containsKey()
  - remove()
  - print all , use entrySet() method.
  

 */
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


 public class TestMapObjObj {
	public static void main(String[] args) {
		Map<Employee, Project> map = new HashMap<>();
		
		Employee e1 = new Employee("user1",1,"testpan1");
		Employee e2 = new Employee("user2",2,"testpan2");
		Employee e3 = new Employee("user3",3,"testpan3");
		
		Project p1 = new Project(12,"pro1");
		Project p2 = new Project(13,"pro2");
		Project p3 = new Project(14,"pro3");
		
		//keep the data in map
		map.put(e1, p1);
		map.put(e2, p2);
		map.put(e3, p3);
		
		Project p4=map.get(e1);// returns project obj
		System.out.println(p4.getpId());
		System.out.println(p4.getpName());
		
		System.out.println("***************contains key *****************************");
		System.out.println(map.containsKey("e1"));
		System.out.println(map.containsKey("e4"));
		
		//GET THE length of map
				int size = map.size();
				System.out.println("size = "+size);
				
				
				//remove the entry
				System.out.println("************removed 128***********************");
				map.remove("user1"); // this will remove both key and value ;
				                  //"128", "user1" is deleted from map
				//GET THE length of map
				size = map.size();
				System.out.println("size= "+size);

		
		System.out.println("**************print all entries***********************");
		for(Entry<Employee, Project> entry :  map.entrySet()) {
			Employee e = entry.getKey();
			Project p = entry.getValue();
			
			System.out.println("key= "+e + " , value=" + p);
		}
	}
}
/*
 Try asisgnment to exlore the methods:
  - get()
  - containsKey()
  - remove()
Map with Employee obj as key and Project obj as value.


 */

