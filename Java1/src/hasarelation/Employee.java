package hasarelation;

public class Employee {
	int id;
	String name;
	int pfno;
	int ppfno;
	
	Address currAddress;// addres obj as instance variable
	Address perAddress;// addres obj as instance variable
	Address officAddress;// addres obj as instance variable
	public Employee(int id, String name, int pfno, int ppfno, Address currAddress,
			Address perAddress,
			Address officAddress) {
		this.id = id;
		this.name = name;
		this.pfno = pfno;
		this.ppfno = ppfno;
		this.currAddress = currAddress;
		this.perAddress = perAddress;
		this.officAddress = officAddress;
	}
	public void showEmployeeInfo() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(pfno);
		System.out.println(ppfno);
	}


}
