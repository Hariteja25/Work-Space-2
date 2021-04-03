package exceptions;
//with execption handling
public class TestException14 {
	public static void main(String[] args) {
		String name = null;
		try {
			System.out.println(name.length());
		} 
		catch (NullPointerException ex) {
			// ex.printStackTrace();
			System.out.println("obj is null: please create obj"
					+ ex.getMessage());
		} 
		finally {
			System.out.println("Program ends");
		}
	}
}


 