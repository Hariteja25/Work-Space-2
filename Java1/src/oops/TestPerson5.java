package oops;

public class TestPerson5 {
	public static void main(String[] args) {
		Person p1 = new Person();// new object is created
		//2.set the data
		p1.id=1000;
		p1.name="kumar";
		p1.age=45;
		
		//print data
		System.out.println("************printing p1****************");
		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		Person p2 = p1;// assignment of p1 to p2
		// here new object is not created
		// both p1 and p2 are pointing to the same object.
		
		
		System.out.println("************printing p2****************");
		System.out.println(p2.id);
		System.out.println(p2.name);
		System.out.println(p2.age);
		
		
	//change p2
		p2.id=1050;
		p2.name="shyam";
		p2.age=50;
		
System.out.println("*******************after chnaging p2*********************************");
		//print data
		System.out.println("************printing p1****************");
		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		
		System.out.println("************printing p2****************");
		System.out.println(p2.id);
		System.out.println(p2.name);
		System.out.println(p2.age);
		
}

}
