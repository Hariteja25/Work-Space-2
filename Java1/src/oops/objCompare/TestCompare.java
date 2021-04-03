package oops.objCompare;

public class TestCompare {
	public static void main(String[] args) {
		//create p1 obj with data
		Person p1 = new Person();
		p1.id = 20001;
		p1.age = 30;
		p1.name = "user1";

		//create p2 obj with data
		Person p2 = new Person();
		p2.id = 20001;
		p2.age = 30;
		p2.name = "user1";

		//dont use  == , use equals() method for comparing two objs
		if (p1.equals(p2)) {
			System.out.println("objs are equal");
		} else {
			System.out.println("objs not equal");
		}
	}

}
