package inheritence.multipleInterface;
/*
 Multiple inheritance:
  - One child class has multiple parent classes.
  -  possible only using interfaces.
  

 - One class can implements any number of interfaces.

   Icici implements both RBIBank and WorldBank.
   
   - How many methods are mandatory for icici to override?
     2 ( createAccount()  and  processLoan() )
 */

public interface RBIBank {
public static final double rateOfIntrest = 12d;
	
	void createAccount() ;

}
