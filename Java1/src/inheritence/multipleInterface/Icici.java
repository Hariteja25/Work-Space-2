package inheritence.multipleInterface;



public class Icici  implements WorldBank , RBIBank{
	public void createAccount() {
		System.out.println("ICICI: createAccount");
	}

	public void processLoan() {
		System.out.println("ICICI: processLoan");
	}

}
