package inheritence.overriding3;
/*
 Person has id,name ,age
 Employee has id,name,age ,pan , pf
 
 Person: parent class
 Employee: Child class
 
 
 1.Person class : 
   write display() method in 
   display method should display id,name,age
   
 2.Employee class : 
   write display() method in 
   display method should display id,name,age ,pan , pf
 */

public class Person {
	//instance  variables
		private String name;
		private int age;
		private int id;

		//constr
		public Person(String name, int age, int id) {
			this.name = name;
			this.age = age;
			this.id = id;
		}
		
		//instance method
		public void display() {
			System.out.println(name);
			System.out.println(id);
			System.out.println(age);
		}
	}









