package methods2;

public class TestPerson2 {
	// ; statement termination
	// {}   --> define a block [ group of cose ]
	//  block{}   -> class , method , if , else , else if , switch , for , while etc......
	// write logic always inside the method 

	// write the print logic one time and reuse for all three objs
	public static void main(String[] args) {
		//1. create obj
		Person p1 = new Person();
		
		//2.set the data
		p1.id=1000;
		p1.name="kumar";
		p1.age=23;
		
		System.out.println("*********print p1********************");
		//print data
		show(p1);
		
		
		Person p2= new Person();
		//p2 has seperate memory for id,name,age
		
		//2.set the data
		p2.id=1001;
		p2.name="shyam";
		p2.age=25;
		
		//print data
		System.out.println("*********print p2********************");
		show(p2);
		
		
		Person p3= new Person();
		//p3 has seperate memory for id,name,age
		
		//2.set the data
		p3.id=1004;
		p3.name="ram";
		p3.age=29;
		
		//print data
		System.out.println("*********print p3********************");
		show(p3);
	}
	
	// passing the object to the method
	public static void show(Person p) {// object as the input arg
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.age);
	}


}
