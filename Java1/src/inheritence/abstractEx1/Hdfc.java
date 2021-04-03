package inheritence.abstractEx1;
/**
For Hdfc overriding the createPPF() method is mandatory.
if Hdfc doesnt override , we will get compilation.
*/
public class Hdfc  extends RBIBank{

	@Override
	public void createPPF() {
		System.out.println("HDFC: create ppf completed.....");
	}
	
}
