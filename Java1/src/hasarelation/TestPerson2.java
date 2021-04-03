package hasarelation;

public class TestPerson2 {
	public static void main(String[] args) {
		//create obj set data
	
		//create addres sobj
		Address addr = new Address("xxxx road", "hyd", "ap", "in", 23231);
		
		//create person obj with data
		Person p = new Person(2000, "user1", 34, addr);
		
		//print person info
		p.showPersonInfo();
		
		//print address info
		p.address.showAddress();
	}

}
