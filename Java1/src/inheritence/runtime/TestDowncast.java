package inheritence.runtime;

public class TestDowncast {
	public static void main(String[] args) {
		Rbi  r = new Hdfc(); // Upcasting
		r.createAcc (); //RBI 
		r.processLoan(); // HDFC
		
		//how to call the child specific method
		//r.demat(); the obj is referred by RBI
		
		
		//solution :
		// typecast to child class : downcasting and call the child method
		//the obj should be referred by HDFC
		
		if( r instanceof Hdfc)  { // check if r is referring to Hdfc
			Hdfc h = (Hdfc) r; //downcasting
			// h and r are pointing to the same object
			// h is the HDFC variable
			// r is the RBI variable
			
			h.demat();  // HDFC
		}
		
	}
}
