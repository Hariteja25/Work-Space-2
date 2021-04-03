package inheritence.multiLevel;
public class Staff extends Employee {

	String contractID;
	String contractPeriod;

	public void displayStaff() {
		System.out.println(contractID);
		System.out.println(contractPeriod);
	}
	 
}
//how many instance varibles are in Staff ??
//7 ( ID, NAME , AGE , PAN , PFNO, contractID, contractPeriod )








