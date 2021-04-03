package inheritence.abstractEx1;

public class TestAbstract {
public static void main(String[] args) { 
		
		//RBIBank r = new RBIBank(); OBJ CANNOT BE CREATED FOR Abstract class
		
		RBIBank r = new Hdfc();
		
		r.createAccount(); //RBI
		r.processLoan();  //RBI
		r.createPPF();    // HDFC
		
	}

}
