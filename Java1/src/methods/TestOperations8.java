package methods;

public class TestOperations8 {
	// call the method of 1st class from the 2nd class
			public static void main(String[] args) {
				// call the big() method inside the Opeartions
				//step 1 : create the Object for Opeartions
				Operations op = new Operations();
				
				//step2 : call the method using the object
				int b1 = op.big(20, 30,40);
				System.out.println(b1);
				
				int b2 = op.big(45,17,18);
				System.out.println(b2);
				
				int b3 = op.big(1200,56,10);
				System.out.println(b3);
			}


}
