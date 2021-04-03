package constructor;
/*
Constructor:
-------------------
- constr we need to write inside the classs.
- When obj is created constr is called automatically.
- With constr we can set the data during obj creation.
  
  Adv:
  creat obj + set the data in single line.

tech points:
------------
we need to write constr within the class.
Constr name is equal to class name.
Constr doesnt have any return type.
We can have any number of constr in a single class -> constr overloading..
A constr is called only one time for one obj..
*/
public class Person {
	// instance variables
		int id;
		String name;
		int age;
		
		// param arg  constructor [3 args]
		public Person(int id, int age, String name) {
			System.out.println("3 args constructr");
			this.id = id;
			this.age = age;
			this.name = name;
		}

		// param arg  constructor [ 2 args]
		public Person(int age, String name) {
			System.out.println("2 args constructr");
			this.age = age;
			this.name = name;
		}

		// zero arg constructor 
		public Person() {
			System.out.println("zero arg constructr");
		}

		//instance method
		public void display() {
			System.out.println(id);
			System.out.println(name);
			System.out.println(age);
		}
		/*
		 this keywords:
-------------------
this refers to the current object

If the instance variables name and local variables names are same , then use this keyword to differeentiate.


public class Person {
	// instance variables
	int id;
	String name;
	int age;
	

// param arg constructor [3 args]
	public Person(int id, int age, String name) {// local variables
		System.out.println("3 args constructr");
		this.id = id; // local variable value assigning to the instance variable
		this.age = age;
		this.name = name;
	}
	
}
*/

}
