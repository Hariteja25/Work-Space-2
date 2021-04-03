package methods;

public class TestOperations3 {
	// call the method of 1st class from the 2nd class
		public static void main(String[] args) {
			// call the printName() method inside the Opeartions
			//step 1 : create the Object for Opeartions
			Operations op = new Operations();
			
			//step2 : call the method using the object
			op.sum(10,20);
			op.sum(45, 65);
			op.sum(70, 13);
		}

}
