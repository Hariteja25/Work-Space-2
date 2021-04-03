package inheritence.single.constructor;

public class Inheritence {
	public static void main(String[] args) {
		// create obj for person
		Person p = new Person("testUser2",50,667676);
		System.out.println("displaying person info");
		p.displayPerson();
		
		
		
		//create obj for employee
		Employee emp = new Employee("testUser1",45,12345,"bnadh671a6","testPfNo");
		System.out.println("displaying employee info");
		emp.displayPerson();
		emp.displayEmp();
	}

}
