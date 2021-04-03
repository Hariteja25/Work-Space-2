package collections.hashMap;
import java.util.HashMap;
import java.util.Map;


public class TestInterview4 {
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
		
		System.out.println("*************Print size******************");
		System.out.println(map.size());
		
		System.out.println("*** Dont Add e4  ***"); 
		Employee e4 = new Employee("user3",3, "testpan3");   
		
		/*
		 As e4 and e3 are duplicates , and e4 is not added to map
		 All operations 
		 get() , remove() ,containsKey() behaves same for e4 and e3.
     
     
      
     
     
		*/
		System.out.println(map.containsKey(e4));// e4  is a duplicate of e3
		System.out.println(map.get(e4)); // e4  is a duplicate of e3
		
		map.remove(e4); //removes e3 + p3 from the map
		
		System.out.println("*****get e3******");
		System.out.println(map.containsKey(e3)); // because e3 is removed @ line 40
		
	}
}
