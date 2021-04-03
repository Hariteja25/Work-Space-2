package exceptions;
public class TestException3{
	
	  public static void main(String[] args) {
			int nums[] = new int[5]; // array size is 5
			System.out.println(nums[9]); // access 10 element
		}


	}
/*
	o/p:
	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 9
		at exceptions.TestException.main(TestException.java:72)
	  
	java creates object for ArrayIndexOutOfBoundsException
*/

