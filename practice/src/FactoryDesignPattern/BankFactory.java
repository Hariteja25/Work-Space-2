package FactoryDesignPattern;
public class BankFactory{
	 	 
	 public static  RBI getBank(String salBank){
		 RBI r = null; 
		 if (salBank.equals("hdfc")) {
			r = new Hdfc(); //create obj for HDFC and refer by RBI
		}else if (salBank.equals("sbi")) {
			r = new SBI();//create obj for SBI and refer by RBI
		} else if (salBank.equals("icici")) {
			r = new Icici();//create obj for Icici and refer by RBI
		} 
		 return r;

	 }
	 
 }
 
 