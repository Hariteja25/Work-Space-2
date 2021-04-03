package inheritence.abstractEx1;
public class Icici extends RBIBank{
@Override
public void createPPF() {
	System.out.println("Icici : created ppf");
}

public void processLoan() {
	System.out.println("RBIBank:: rate of intrest 12%");
}
}
//overriding createPPF() is mandatory
//over




