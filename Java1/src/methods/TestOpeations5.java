package methods;

public class TestOpeations5 {
	// call the method of 1st class from the 2nd class
		public static void main(String[] args) {
			// call the process() method inside the Opeartions
			//step 1 : create the Object for Opeartions
			Operations op = new Operations();
			
			//step2 : call the method using the object
			String v1 = op.process("kumar");
			System.out.println(v1);
			
			String v2 = op.process("shyam");
			System.out.println(v2);
			
			String v3 = op.process("raju");
			System.out.println(v3);
		
		}

}
