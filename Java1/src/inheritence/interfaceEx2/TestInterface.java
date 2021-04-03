package inheritence.interfaceEx2;

public class TestInterface {
	public static void main(String[] args) {
	 	RBIBank r = new  Icici();
	 	r.createAccount(); // Icici
	 	r.processLoan();   // Icici
	}

}
