package collections.arrays;

public class TestString {
	public static void main(String[] args) {
		String[] names = { "user1",  "kumar",  "ram", "raj","rakul","shyam"}; // create array with data
		
		//find the size of array
		int size = names.length;
		System.out.println("array size = " + size);

		// read all enhances for loop
		System.out.println("Print ALL using enhanced for  loop");
		for (String p : names) {
			System.out.println(p);
		}

	}

}
