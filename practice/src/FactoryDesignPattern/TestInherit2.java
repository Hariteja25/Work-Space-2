package FactoryDesignPattern;


import java.util.Scanner;

public class TestInherit2{

public static void main(String[] args) {
    	 //Take Bank name as input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary bankname:");
		String salBank = sc.next();
		
		RBI r =  BankFactory.getBank(salBank);
		r.processLoan();

}
}




