package inheritence.single;
/* 
Person has id,name, age
Employee has id,name, age , pan , pf

create the objs , set data and print.

*/

public class Person {
	 String name;
	  int age;
	  int id;

	  public void displayPerson(){
		  System.out.println(name);
		  System.out.println(id);
		  System.out.println(age);
	  }

}
