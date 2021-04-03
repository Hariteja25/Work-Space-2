package collections.hashSet;

import java.util.HashSet;
import java.util.Set;

public class TestHashSetPerson4 {
	public static void main(String[] args) {
		//create hashset
		Set<Person> persons = new HashSet<Person>();

		//create p1 , add p1
		Person p1 = new Person(123, "user5", 45);
		persons.add(p1);

		System.out.println("size = " + persons.size());
		
		//create p2 , remove p2
		Person p2 = new Person(123, "user5", 45);
		persons.remove(p2); 
		// if p2 is removed then p1 is also removed from set,
		//because p1 and p2 are duplicates.
		
		System.out.println("size = " + persons.size());
	}
}

