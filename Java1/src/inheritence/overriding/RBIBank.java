package inheritence.overriding;
/*RBIBank is the parent class.
RBI  provides loan @ 9%.


HDFC is a child; HDFC wants to give loan @ 12%.

HDFC  DOESNOT NEED LOGIC FROM THE Parent ; hdfc has to provide its own logic process loan

solution: 
- method overriding.
- parent class and child class has the same method name & method signature

======> method overriding [replace the parent logic]
- Used only in inheritance
- parent and child class will have the same methodName + same method signature 
but with diff logic 
*/
public class RBIBank {
	public void createAccount() {
		System.out.println("RBIBank:: created Account");
	}
	
	public  void processLoan(){
		System.out.println("RBIBank:: rate of intrest 9%");
	}

}
