package exceptions;
//without Exception handling
public class TestException2{
	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 0;

		int x = num1 / num2;
		System.out.println(x);
		System.out.println("Program ends");

	}

}
/*
if num2 is zero , then exception occurs; because division by 0 is not possible.
o/p:
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at exceptions.TestException.main(TestException.java:50

java creates ArithmeticException object.
*/