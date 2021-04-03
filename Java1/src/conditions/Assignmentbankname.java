package conditions;

import java.util.Scanner;

public class Assignmentbankname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);// sc is point of contact for console

		System.out.println("enter bank name");
		String bankname = sc.next();
		switch(bankname) {
		case "sbi" : System.out.println("10%");  break;
		case "icici" : System.out.println("11%");  break;
		case "hdfc" : System.out.println("12");  break;
		case "citi" : System.out.println("13%");  break;
		default : System.out.println("invaid bank"); break;
		}
	}

	/*
		  when should we use switch::
		  - compare one variable with diff values 
		  - there is a dependency between the conditions
		  - at a time only one condition is satisfied
		 * */


	}


