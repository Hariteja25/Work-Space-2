package inheritence.interfaceEx1;

public class TestInterface {
public static void main(String[] args) {
		
		RBI r = new Icici();// create obj for Icici and refer by RBI
		r.createAccount(); // icici
		r.createPPF();   // icici
		r.getKYC(); // icici
	}

}
