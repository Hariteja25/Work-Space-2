package inheritence.multiLevel.constructor;

public class TestStaff {
	public static void main(String[] args) {

		System.out.println("*****displaying person info*******");
		Person p = new Person(123,"user1", 23);
		p.displayPerson();
		
		
		
		System.out.println("*****displaying employee info*******");
		Employee e = new Employee(124,"user2", 24,"testpan1","testpf1");
		e.displayPerson();
		e.displayEmp();
		
		
		
		System.out.println("*****displaying staff info*******");
		Staff sf  =  new Staff(126, "user3", 29, "testpf2", "testpan3", "c123", "12");
		sf.displayPerson();
		sf.displayEmp();
		sf.displayStaff();
	}
}


