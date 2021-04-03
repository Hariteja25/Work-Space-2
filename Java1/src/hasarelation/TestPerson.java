package hasarelation;

public class TestPerson {
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
		
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.age);
		
		System.out.println(p.address.city);
		System.out.println(p.address.state);
		System.out.println(p.address.Country);
		System.out.println(p.address.street);
		System.out.println(p.address.pin);
		
	}

}
