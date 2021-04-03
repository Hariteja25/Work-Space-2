package inheritence.overriding2;
public class Icici extends RBIBank{

	//overriding
	public  void processLoan(){
		super.processLoan(); // call the parent method from the child method
		System.out.println("ICICI:: Additional charge of Rs.2000");
	}
	
	// super is a keyword
	// use super keyword only in child class
	// use super when parent  methods and child methods have the same name.
	
}



