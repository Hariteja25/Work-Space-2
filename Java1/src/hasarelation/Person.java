package hasarelation;

public class Person {
	//instance variables
		int id;
		String name;
		int age;
		Address address;// addres obj as instance variable
		public void showPersonInfo() {
			System.out.println(id);
			System.out.println(name);
			System.out.println(age);
		}
		public Person(int id, String name, int age, Address address) {
			this.id = id;
			this.name = name;
			this.age = age;
			this.address = address;
		}


		public Person() {
		}



	}





