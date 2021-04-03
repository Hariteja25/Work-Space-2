package methods;

public class TestOperations4 {
	// call the method of 1st class from the 2nd class
		public static void main(String[] args) {
			// call the getData() method inside the Opeartions
			//step 1 : create the Object for Opeartions
			Operations op = new Operations();
			
			//step2 : call the method using the object
			String v1 = op.getData();
			System.out.println(v1);
		}
}
