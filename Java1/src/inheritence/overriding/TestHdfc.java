package inheritence.overriding;

public class TestHdfc {
	public static void main(String[] args) { 
		// CREATE OBJ FOR ICICI
		Hdfc h = new 	Hdfc();
		h.createAccount();// from RBI
		h.processLoan();  // FROM HDFC
		h.demat();
	}

}
