package oops.methods.withInstanceMethods;

public class Person {
	// id,name, age are instance variables
		int id;
		String name;
		int age;
		
		
		//display() is the instance method
		// from the instance method we can access the instance variables.
		public void display(){
			System.out.println(id);// print id
			System.out.println(name);
			System.out.println(age);
		}
		// for Accessing the instance variables or instances method
		//step1 : Create the object
		//step2: 
		//access the instance variable using the obj
		//access the instance method using the obj
		//display() method contains the common logic for any object
}


