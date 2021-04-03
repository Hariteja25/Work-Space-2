package hasaAndIsaRelation;

public class Person {
	private String name;
	private int age;
	private int id;
	private Address address;
	
	public Person(String name, int age, int id, Address address) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.address = address;
	}

	public void displayPerson() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
	}
	

}
