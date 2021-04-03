package polymorphism;
/*
1. Person has
id, name , age , street , city , state , country , pin


2. Student has 
id , fname, lastname , sem , street , city , state , country , pin


3.Employee has 
id, fname , lname , pfno , ppfno  +
3 addresses
1.street , city , state , country , pin for permannet address
2.street , city , state , country , pin for present address
3.street , city , state , country , pin for ofice address

*/

public class Person1 {
	int id;
	String name;
	int age;
	String street;
	String city;
	String state;
	String country;
	int pin;
	
	public Person1(int id, String name, int age, String street, String city,
			String state, String country, int pin)
	{
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
	}

	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(street);
		System.out.println(city);
		System.out.println(state);
		System.out.println(country);
		System.out.println(pin);
		
	}
	

}
