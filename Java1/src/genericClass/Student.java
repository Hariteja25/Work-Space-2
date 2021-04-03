package genericClass;
/*
Assignment--

Write generic class with 
two instance variables  : [both i.v. are generic]
constr   -> to set the data for i.v.
print method  -> to print the data for i.v.
*/


public class Student<T> {
	private T id;
	private T name;
	
	
	public Student(T id, T name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void print() {
	System.out.println(id);
	System.out.println(name);
	}
	
}
