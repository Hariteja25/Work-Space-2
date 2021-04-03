package hasarelation;

public class TestPerson1 {
	public static void main(String[] args) {
		//create obj set data
	
		//create person obj with data
		Person p = new Person();
		p.id=2000;
		p.name="user1";
		p.age=34;
		
		//create addres sobj
		Address addr = new Address();
		addr.city="hyd";
		addr.state="ap";
		addr.Country="in";
		addr.street="xxxx road";
		addr.pin=23231;
		
		//keep address obj inside the person obj
		p.address = addr;
		
		//print person info
		p.showPersonInfo();
		
		//print address info
		p.address.showAddress();
	}

}
