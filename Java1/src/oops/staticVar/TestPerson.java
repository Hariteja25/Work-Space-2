package oops.staticVar;

public class TestPerson {
	public static void main(String[] args) {
		//accesss instance variables using object
		Person p1 = new Person();
		
		p1.id=2000;
		p1.name="user1";
		p1.sal=233;
		
		
		//access static varibles using class name
		Person.count = 3000;
		
		System.out.println(Person.count);
		
	}

}
