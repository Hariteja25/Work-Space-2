package constructor;

public class TestPerson {
public static void main(String[] args) {
		
		System.out.println("***********create obj with zero arg constr***************");
		//without constr
		Person p = new Person(); // calls zero arg const
		
		//set data
		p.id=2000;
		p.name="user1";
		p.age=67;
		
		p.display();
		
		
		System.out.println("***********create obj with 3 arg constr***************");
		//with constr 
		// create obj + set data
		Person p1 = new Person(30000, 45, "kumar");// calls 3 arg const
		p1.display();
		
	}
/* 
  old approach
 
	Person p1 = new Person();
	p1.id=20001;
	p1.name="user1";
	p1.age=29;
	
	//new approach
	Person p3 = new Person(20003,31, "user3");
	Person p4 = new Person(20004,32, "user4");
	*/


}
