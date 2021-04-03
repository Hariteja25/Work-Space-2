package methods;

public class TestOperations2 {
	// call the method of 1st class from the 2nd class
		public static void main(String[] args) {
			// call the printName() method inside the Opeartions
			//step 1 : create the Object for Opeartions
			Operations op = new Operations();
			
			//step2 : call the method using the object
			op.printName("Kumar");
			op.printName("shyam");
			op.printName("ram kumar");
			
			
		}

}
