package java8Features;
/*
 Can we write default method/static method in a interface?
YES,from java 8

Interface can have any number of default, static methods and abstract methods.
The concept of default method is used to define a method with default implementation

 */

public interface Controller {

	//abstract method
	void process(String str);
	
	//abstract method
	void process1(String str);

	//default method
	default void log(String str) {
		System.out.println("I1 logging::" + str);
	}

	//static method
	static void print(String str) {
		System.out.println("Printing " + str);
	}

}