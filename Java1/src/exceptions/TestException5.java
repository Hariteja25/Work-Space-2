package exceptions;
public class TestException5{
	
	  public static void main(String[] args) {
			String name = "";
			int num1 = 20;
			int num2 = 1;
			int nums[] = new int[5];
			
			//can fail due to number format
			int num = Integer.parseInt("ABC");
			System.out.println(" after conversion ::"+num);
			
			// possibility of exception due to divide by zero
			int x = num1 / num2;
			System.out.println(x);

			// java.lang.NullPointerException occurs if obj is not created
			System.out.println(name.length());

			// error due to invalid index array index out of bound
			System.out.println(nums[9]);
		}
	  
	}
	 
	/* 
	 
	 solution: try with multiple catches
	 at a time only one exception is created.
	 */
