package encapsulation;

public class TestPerson {
	public static void main(String[] args) {
		//create obj
		Person p = new Person();
		
		//set data
		//p.id=200;
		p.setId(2000);
		//p.name= "user1";
		p.setName("user1");
		//p.age=34;
		p.setAge(34);
		
		
		//print data
		//System.out.println(p.id);
		System.out.println(p.getId());
		//System.out.println(p.name);
		System.out.println(p.getName());
		//System.out.println(p.age);
		System.out.println(p.getAge());
		
	}

}
