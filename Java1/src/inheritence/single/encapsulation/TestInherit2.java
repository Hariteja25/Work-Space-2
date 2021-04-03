package inheritence.single.encapsulation;

public class TestInherit2 {
	public static void main(String[] args) {
		// create obj for person
		Person p = new Person();
		//use the set methods for setting the data
		p.setId(3000);
		p.setName("testUser2");
		p.setAge(50);
		p.setId(65556);

		System.out.println("displaying person info");
		p.displayPerson();
		
		
		//create obj for employee
		Employee emp = new Employee();
		//set data for inherited props
		emp.setName("testUser1");
		emp.setAge(45);
		emp.setId(12345);
		emp.setPan("bnadh671a6");
		emp.setPfNo("testPfNo");
		
		System.out.println("displaying employee info");
		emp.displayPerson();
		emp.displayEmp();
	}

}
