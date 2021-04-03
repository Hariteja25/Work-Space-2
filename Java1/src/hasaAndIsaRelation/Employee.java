package hasaAndIsaRelation;
public class Employee extends Person{

	private String pan;
	private String pfNo;
	
	public Employee(String name, int age, int id, Address address, String pan, String pfNo) {
		super(name, age, id, address); // call the parent constr
		this.pan = pan;
		this.pfNo = pfNo;
	}

	public void displayEmp(){
		System.out.println(pan);
		System.out.println(pfNo);
	}
	
	}