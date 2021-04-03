package oops.objCompare;

public class TestCompare2 {
	// for comparing two objs , dont use == 
//== compares only the object adresses, == will not compare the object data....
			
	public static void main(String[] args) {
		//create obj
		Person p1 = new Person();
		p1.id = 1000;
		p1.name = "user1";
		p1.age = 30;

		
		//create obj
		Person p2 = new Person();
		p2.id = 1000;
		p2.name = "user1";
		p2.age = 30;

		
		// for comparing two objs , dont use == 
		//== compares only the object adresses, == will not compare the object data....
		if (p1 == p2) {
			System.out.println("objs are equal");
		} else {
			System.out.println("objs not equal");
		}

}
}
