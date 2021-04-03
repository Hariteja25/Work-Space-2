package methods;

public class TestOperations9 {
	// call the method of 1st class from the 2nd class
				public static void main(String[] args) {
					// call the small() method inside the Opeartions
					//step 1 : create the Object for Opeartions
					Operations op = new Operations();
					
					//step2 : call the method using the object
					int b1 = op.small(20, 30,40);
					System.out.println(b1);
					
					int b2 = op.small(45,17,18);
					System.out.println(b2);
					
					int b3 = op.small(1200,56,10);
					System.out.println(b3);
				}


}
