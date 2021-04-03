package exceptions;

import java.util.Scanner;

/*
How to do exception handling:

Introduce three blocks
1. try block   -  <write code that has chances for exception>
2. catch block  -   <exception handling code>
3. finally block

​
 */
//with execption handling
public class TestException0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age::");
		String age = sc.next();
		int ageInt = 0;
		
		try {
			ageInt = Integer.parseInt(age);
		}
		catch(NumberFormatException ex) {
			 //if exception occurs then give meaning msg to customer
			System.out.println("invalid input ::"+age+". " +
					"please try again");
		}finally {
			System.out.println("finally completed");
		}
		
		System.out.println("after conversion age int :: " + ageInt);
		System.out.println("exit");

	}
}




