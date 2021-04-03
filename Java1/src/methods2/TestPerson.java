package methods2;

public class TestPerson {
	public static void main(String[] args) {
		//1. create obj
		Person p1 = new Person();
		
		//2.set the data
		p1.id=1000;
		p1.name="kumar";
		p1.age=23;
		
		System.out.println("*********print p1********************");
		//print data
		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		
		Person p2= new Person();
		//p2 has seperate memory for id,name,age
		
		//2.set the data
		p2.id=1001;
		p2.name="shyam";
		p2.age=25;
		
		//print data
		System.out.println("*********print p2********************");
		System.out.println(p2.id);
		System.out.println(p2.name);
		System.out.println(p2.age);
		
		
		Person p3= new Person();
		//p3 has seperate memory for id,name,age
		
		//2.set the data
		p3.id=1004;
		p3.name="ram";
		p3.age=29;
		
		//print data
		System.out.println("*********print p3********************");
		System.out.println(p3.id);
		System.out.println(p3.name);
		System.out.println(p3.age);
	}
}
