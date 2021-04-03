package exceptions;
//converts string to int
//use Integer.parseInt() function.

//without exception handling

import java.util.Scanner;

public class TestException {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age::");
		String age = sc.next();
		int ageInt = 0;
		ageInt = Integer.parseInt(age);
		System.out.println("after conversion age int :: " + ageInt);
		System.out.println("exit");

	}
  
  }
 /*
   case-1: enter the age::
34
after conversion age int :: 34
exit

case-2: enter the age::
ABC
Exception in thread "main" java.lang.NumberFormatException: For input string: "ABC"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at exceptions.TestException.main(TestException.java:16)

  
  */
  
