package exceptions;
//without exception handling
public class TestException4{
	
	  public static void main(String[] args) {
			String name = null;
			int len =name.length();
			System.out.println("length = "+len);
		}
/*
 cannot call methods without creating the object.

o/p:
Exception in thread "main" java.lang.NullPointerException
	at exceptions.TestException.main(TestException.java:90)

java creates obj for NullPointerException

 */
		


	}

