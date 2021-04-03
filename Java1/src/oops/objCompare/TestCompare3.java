package oops.objCompare;

public class TestCompare3 {
	public static void main(String[] args) {
		//create new object
		Person p1 = new Person();
		p1.id = 1000;
		p1.name = "user1";
		p1.age = 30;

		//new object is not created , both p1 & p2 has same address.
		Person p2 = p1;

		if (p1 == p2) {
			System.out.println("objs are equal");
		} else {
			System.out.println("objs not equal");
		}

	}

}
