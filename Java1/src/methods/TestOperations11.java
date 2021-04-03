package methods;

public class TestOperations11 {
	// call the method of 1st class from the 2nd class
		public static void main(String[] args) {
			//step 1 : create the Object for Opeartions
			Operations op = new Operations();
			int fact= op.fact(3);
			int fact1= op.fact(5);
           
			
			System.out.println("factorial =" +fact);
			System.out.println("factorial =" +fact1);
}
}