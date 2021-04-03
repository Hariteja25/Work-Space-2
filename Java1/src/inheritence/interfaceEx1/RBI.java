package inheritence.interfaceEx1;
/*
 RBIBank is a interface.and has 3 abstract methods
  - createAccount() 
  - getKYC()
  - createPPF()
 */
public interface RBI {
	
	public static final double rateOfIntrest = 12d;
	
	public abstract void createAccount() ;
	
	public abstract void getKYC();

	public abstract void createPPF();
	
}
