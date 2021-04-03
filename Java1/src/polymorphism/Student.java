package polymorphism;
/*
 Student has 
id , fname, lastname , sem , street , city , state , country , pin

 */

public class Student {
	int id;
	String fname;
	String lname;
	int sem;
	String street;
	String city;
	String state;
	String country;
	int pin;
	
public Student(int id, String fname, String lname, int sem, String street,
		String city, String state, String country,
		int pin) {
	this.id = id;
	this.fname = fname;
	this.lname = lname;
	this.sem = sem;
	this.street = street;
	this.city = city;
	this.state = state;
	this.country = country;
	this.pin = pin;
}

public void display() {
	System.out.println(id);
	System.out.println(fname);
	System.out.println(lname);
	System.out.println(sem);
	System.out.println(street);
	System.out.println(city);
	System.out.println(state);
	System.out.println(country);
	System.out.println(pin);
	
}
}
