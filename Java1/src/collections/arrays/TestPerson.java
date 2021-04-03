package collections.arrays;

public class TestPerson {
	public static void main(String[] args) {

		Person[] persons = new Person[4];// create array of person objs with size 4
		
		//insert 
		persons[0]=new Person(1000, "kumar");
		persons[1]=new Person(1001, "ram");;
		persons[2]=new Person(1002, "shyam");;
		persons[3]=new Person(1003, "raj");;
		
		
		//read all
		System.out.println("*******show all persons**********************");
		for(Person p : persons) {
			System.out.println(p.id + " -  " + p.name);
		}
	}

}
