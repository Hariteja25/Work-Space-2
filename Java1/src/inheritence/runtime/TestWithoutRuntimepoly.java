package inheritence.runtime;

import java.util.Scanner;

/*
RBI : parent class
       - createAcc
       - processLoan
 HDFC, ICICI , SBI are child classes for RBI
 
 HDFC, ICICI , SBI  : overriding the processLoan() method
 
 Take Bank name as input
 if Bank name is "hdfc" then create obj for hdfc class and call createAcc() and processLoan() methods. 
 if Bank name is "sbi" then create obj for SBI Class and call createAcc() and processLoan() methods. 
 if Bank name is "icici" then create obj for ICICI and call createAcc() and processLoan() methods. 
*/

public class TestWithoutRuntimepoly {
	public static void main(String[] args) {
		
		//Take Bank name as input
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your salary bankname:");
			String salBank = sc.next();
			
			if (salBank.equals("hdfc")) {
				Hdfc h = new Hdfc();
				h.createAcc();
				h.processLoan();
			} else if (salBank.equals("sbi")) {
				Sbi s = new Sbi();
				s.createAcc();
				s.processLoan();
			} else if (salBank.equals("icici")) {
				Icici i = new Icici();
				i.createAcc();
				i.processLoan();
			} 
		}



}


