package oops;

public class TestPerson4 {
	public static void main(String[] args) {
		Person p1 = new Person();
		//2.set the data
		p1.id=1000;
		p1.name="kumar";
		p1.age=45;
		
		//print data
		System.out.println("************printing p1****************");
		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		Person p2 = p1;
		System.out.println("************printing p2****************");
		System.out.println(p2.id);
		System.out.println(p2.name);
		System.out.println(p2.age);
		}

}
