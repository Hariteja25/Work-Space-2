package exceptions;
//with execption handling
public class TestException12 {
	public static void main(String[] args) {
		//input two nums
		int num1 = 20;
		int num2 = 0;

		try {
			int x = num1 / num2;
			System.out.println(x);
		}
		catch(ArithmeticException ex) {
			System.out.println("num2 cannot be zero");
		}
		System.out.println("Program ends");
	}
}
