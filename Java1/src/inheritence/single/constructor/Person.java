package inheritence.single.constructor;
/* 
Person has id,name, age
Employee has id,name, age , pan , pf

create the obj , set data and print.

- Person constr will have 3 arguments.
- Employee constr will have 5 arguments.
  From employee constr we need to call the person contr using the super keyword.
*/

public class Person {
	String name;
	int age;
	int id;

	public Person(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public void displayPerson() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
	}

}
