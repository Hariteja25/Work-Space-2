package exceptions;
/*
 How to do generic exception handling??
----------------------------------------
COMMON CATCH BLOCK FOR ANY EXCEPTION
 catch (Exception ex) {	 
}   // this catch block can handle any exception.

->Exception is a parent class
->ArithmeticException , NullPointerException ,  ArrayIndexOutOfBoundsException , NumberFormatException are child classes
of Exception class.


 */
public class TestGenericExceptionHandling {
	public static void main(String[] args) {
		String name = null;
		int num1= 20;
		int num2 = 1;
		int nums[] = new int[5];
		try {
			//can fail due to number format
			int num = Integer.parseInt("1243");
			System.out.println(" after conversion ::"+num);
			
			// possibility of exception due to divide by zero
			int x = num1 / num2;
			System.out.println(x);

			// java.lang.NullPointerException occurs if obj is not created
			System.out.println(name.length());

			// error due to invalid index array index out of bound
			System.out.println(nums[9]);
		} catch (Exception ex) {
			System.out.println("Exception created. due to ::" + ex.getMessage());
		} 
		
		System.out.println("Program ends");
	}

}	 
