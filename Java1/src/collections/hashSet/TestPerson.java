package collections.hashSet;

import java.util.HashSet;
import java.util.Set;

public class TestPerson {
	public static void main(String[] args) {

		//create hashset for persons
		Set<Person> persons = new HashSet<Person>();

		//create person objs
		Person p1 = new Person(1000, "user1", 27);
		Person p2 = new Person(1001, "user2", 28);
		Person p3 = new Person(1002, "user3", 29);
		Person p4 = new Person(1002, "user3", 29); // p4 is a duplicate for p3 , so will not added
		
		// set avoids duplicates objects
		
		//add the person objs
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		
		System.out.println("size = "+ persons.size());
		//print all the persons
		System.out.println("Entered persons ARE :");
		for (Person p : persons) {
			System.out.println(p.getId()  +  " , " + p.getName() + " , " + p.getAge());
		}
		
	}
	}


