package inheritence.runtime;

public class Hdfc extends Rbi {
	public void processLoan() {
		System.out.println("HDFC: 12%");
	}
	
	public void demat() {
		System.out.println("HDFC: demat 13%");

}
/*	Hdfc h = new Hdfc(); // create obj for child class and refer by child class

	RBI r =  new Hdfc(); // create obj for child class and refer by parent class.
RBI r =  new Hdfc(); // create obj for child class and refer by parent class.[upcasting]
		
		//Hdfc r2 =  new RBI(); --  create obj for parent class and refer by child class.- not possible and it gives compilation
	*/
}