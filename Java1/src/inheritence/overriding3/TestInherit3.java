package inheritence.overriding3;

public class TestInherit3 {
	public static void main(String[] args) { 
		Person p = new Person("testPers1", 45, 131);
		System.out.println("**************displaying person***************");
		p.display();
		
		
		Employee emp = new Employee("testuser1", 28, 12345, "test_pan", "test_pf");
		System.out.println("*******************displaying employee************");
		emp.display();
	}

}
