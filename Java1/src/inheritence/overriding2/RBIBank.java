package inheritence.overriding2;
/*RBIBank: parent class
- createAccount()
- processLoan()     : RATE OF INTREST OF 9%

HDFC :child class of RBIBank

ICICI :child class of RBIBank
 - roi 9 % is fine ; But on top of that ICICI would like to charge rs.2000 as service charge.
 -
   roi 9% should come from RBI and additional charge 2000 should come from ICICI
   
      logic both from parent and child.

solution : 
overriding + call parent method from child
*/
public class RBIBank {
	public void createAccount() {
		System.out.println("RBIBank:: created Account");
	}
	
	public  void processLoan(){
		System.out.println("RBIBank:: rate of intrest 9%");
	}
}








