package inheritence.multiLevel.constructor;
/* 
Person has id,name, age
Employee has id,name, age , pan , pf
Staff has id,name, age , pan , pf , contractId , contractPeriod.


Person is the parent class for Employee.
Employee is the parent class for Staff. 


Staff class will get inheritance from Person and Employee.

Person constructor has 3 args.
Employee constructor has 5 args , Person constr is called from the employee constr..
Staff constructor has 7 args , Employee constr is called from the Staff constr..

create the objs , set data and print.

*/
public class Person {
	int id;
	String name;
	int age;


	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public void displayPerson(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
	

}
