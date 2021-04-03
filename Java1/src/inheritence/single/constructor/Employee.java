package inheritence.single.constructor;
public class Employee extends Person{

	String pan;
	String pfNo;
	
	// From employee constr we need to call the person contr using the super keyword.
	// 
	public Employee(String name, int age, int id, String pan, String pfNo) {
		super(name, age, id);// this will call person constr [to intialize the id,name,age]
		this.pan = pan;
		this.pfNo = pfNo;
	}

	public void displayEmp(){
		System.out.println(pan);
		System.out.println(pfNo);
	}
}