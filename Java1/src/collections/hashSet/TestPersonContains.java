package collections.hashSet;
import java.util.HashSet;
import java.util.Set;

public class TestPersonContains {
	public static void main(String[] args) {
		
		Set<Person> persons = new HashSet<>();
		
		Person p1 = new Person(1, "user1", 29);
		persons.add(p1);

		Person p2 = new Person(1, "user1", 29);
		
		if (persons.contains(p2)) {
			System.out.println("p2 exists");//because p1 and p2 are duplicates.
		} else {
			System.out.println("p2 doesnt exists");
		}
	}
}
