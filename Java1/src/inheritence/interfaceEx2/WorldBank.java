package inheritence.interfaceEx2;
/*
 WorldBank - [interface]
           |
           |  processLoan()  - abstract
           | 
         RBIBank   - [interface]   extends WorldBank
           |
           |  createAccount  - abstract
           |    
         Icici   - [class] implements RBIBank
           |
           | - has to override all abstarct methods 
           |
 implements  ---> applicable for a class
extends  ----> applicable for class / interface



 
 */

public interface WorldBank {
	public abstract void processLoan();
	}






