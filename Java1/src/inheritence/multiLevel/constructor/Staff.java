package inheritence.multiLevel.constructor;
public class Staff extends Employee {

	String contractID;
	String contractPeriod;

	 
	public Staff(int id, String name, int age, String pfNo, String pan, String contractID, String contractPeriod) {
		super(id, name, age, pfNo, pan);//call the employee constr
		this.contractID = contractID;
		this.contractPeriod = contractPeriod;
	}

	public void displayStaff() {
		System.out.println(contractID);
		System.out.println(contractPeriod);
	}
	 
}
