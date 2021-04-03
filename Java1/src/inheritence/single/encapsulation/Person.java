package inheritence.single.encapsulation;
/* 
Person has id,name, age
Employee has id,name, age , pan , pf

create the obj , set data and print.

- Person class will have id,name, age as private and public setters  + getters
- Employee constr will have pan , pf as private and public setters  + getters
*/

public class Person {
	private String name;
	private int age;
	private int id;

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}


	public void displayPerson() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
	}

}
