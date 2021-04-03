package inheritence.multiLevel;

public class TestStaff {
public static void main(String[] args) {
		
		System.out.println("***************printing person info******************");
		Person p = new Person();
		p.name = "person1";
		p.id = 123;
		p.age = 21;
		p.displayPerson();

		
		System.out.println("***************printing employee info******************");
		Employee e = new Employee();
		e.name = "emplyee1";
		e.id = 23;
		e.age = 21;
		e.pan = "wrwr223";
		e.pfNo = "33232";
		e.displayPerson();
		e.displayEmp();

		
		System.out.println("***************printing Staff info******************");
		Staff sf = new Staff();
		sf.id = 23;
		sf.age = 29;
		sf.name = "user1";
		sf.pan = "bncpu65ad";
		sf.pfNo = "pf@@@";
		sf.contractID = "contct@@@@";
		sf.contractPeriod = "5";

		sf.displayPerson();
		sf.displayEmp();
		sf.displayStaff();
	}

}
