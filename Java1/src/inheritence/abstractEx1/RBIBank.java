package inheritence.abstractEx1;

public abstract class RBIBank {
	public void createAccount() {
		System.out.println("RBIBank:: created Account");
	}
	
	 
	public void processLoan(){
		System.out.println("RBIBank:: rate of intrest 9%");
	}
	
	public abstract void createPPF() ;
}





