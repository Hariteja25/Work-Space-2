package exceptions;

//with execption handling
public class TestException13{
	public static void main(String[] args) {
		int nums[] = new int[5]; // array size is 5
		try {
			System.out.println(nums[9]); // access 10 element
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("invalid array access");
		}
	}
}

