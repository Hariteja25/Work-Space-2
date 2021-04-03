package inheritence.multiLevel.abstractEx1;

public class TestInheritence {
	public static void main(String[] args) {
		RBI r = new Icici(); // CREATE obj for child and refer by parent
		r.createAccount(); // icici
		r.createPPF();  // icici
		r.getKYC();  // icici
	}
}


