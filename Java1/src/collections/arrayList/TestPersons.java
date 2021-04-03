package collections.arrayList;
import java.util.ArrayList;
import java.util.List;

public class TestPersons {
	public static void main(String[] args) {
  
  //create the arraylist
  List<Person> persons = new ArrayList<Person>();
  
  //create 3 person objs
  Person p1 = new Person(1000, "user1", 27);
	Person p2 = new Person(1001, "user2", 28);
	Person p3 = new Person(1002, "user3", 29);
  
  
  //add person objs inside the arraylist
  persons.add(p1);
	persons.add(p2);
	persons.add(p3);
		
    
  System.out.println("Entered persons ARE :");
   for (Person p : persons) {
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getAge());
		}
    
  
  }
  
}
