package hasaAndIsaRelation;

public class TestHasaIsa {
	public static void main(String[] args) {
		//CREATE obj + set data + print for Person
		System.out.println("********************show person info*********************");
		Address a1 = new Address("1","abc", "hyd", "TS","in", "500012");
		
		Person p1 = new Person("kumar", 26, 10000,a1); // a1 obj is kept inside p1
		p1.displayPerson();
		a1.displayAddress();
		
		//CREATE obj + set data + print for Employee
		System.out.println("********************show employee info*********************");
		Address a2 = new Address("2","xyz", "banlr", "ka","in", "560037");
		
		Employee e = new Employee("RAM", 30, 10002, a2, "testpan", "testpf");// a2 obj is kept inside employee obj e
		e.displayPerson();
		e.displayEmp();
		a2.displayAddress();
		
	}

}
