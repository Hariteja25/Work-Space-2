package oops.staticBlock;

public class Person {
	int id; //instance variable
	static int count; // static variable
	
	//instance method
	public void show() {
		System.out.println("in instance method");
	}
	
	//static method
	public static void getData() {
		System.out.println("inside the static method");
	}
	
	
	//static block
	static {
		System.out.println("in static block");
		
		
	}


	//constructor
	public Person(int id) {
		System.out.println("in constructor");
		this.id = id;
	}

}
