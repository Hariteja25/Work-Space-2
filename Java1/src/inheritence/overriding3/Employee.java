package inheritence.overriding3;
public class Employee extends Person {

	//instance varibles
	private String pan;
	private String pfNo;

	
	//constr
	public Employee(String name, int age, int id, String pan, String pfNo) {
		super(name, age, id); // call the parent constr from child const
		this.pan = pan;
		this.pfNo = pfNo;
	}
	
	//instance method
	public void display() {
		super.display();// call the display method of Person class
		System.out.println(pan);
		System.out.println(pfNo);
	}

}
