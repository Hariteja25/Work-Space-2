package inheritence.multipleEx1;
/*
 1. WorldBank  [interface]
        |
        | - processLoan()    - abstract method
        |
     
   
    2. RBI [interface]
        |
        | - createAccount()   - abstract method
        | 
        |
   
    3. MyBank   - [ abstract class]
        |
        |  - showBalance()   - non-abstract method
        |  - demat()    - abstract method     
        |
    
        
  Icici extends MyBank and implements WorldBank ,RBI
    
   1.How many methods are mandatory for ICICI to override?
     - 3   [processLoan()   ,  createAccount()     , demat()  ]
 */

public interface WorldBank {
	public abstract void processLoan();

}
