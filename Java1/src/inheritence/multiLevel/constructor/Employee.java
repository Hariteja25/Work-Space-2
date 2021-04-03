package inheritence.multiLevel.constructor;
public class Employee extends Person {

	String pfNo;
	String pan;

	public Employee(int id, String name, int age, String pfNo, String pan) {
		super(id, name, age);//call the person constr ..
		this.pfNo = pfNo;
		this.pan = pan;
	}

	public void displayEmp() {
		System.out.println(pfNo);
		System.out.println(pan);
	}
 }
