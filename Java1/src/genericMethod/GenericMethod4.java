package genericMethod;
/*
 Req:
Write a generic method that prints elements inside an array of any dataType
Ex:
	// Create arrays of Integer, Double and Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		String[] strArray = { "hyd", "banglr", "chenai" };

solution: 
private static <T> void print(T []  elements) {
		for(T element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
 */


public class GenericMethod4 {

	public static void main(String args[]) {
		// Create arrays of Integer, Double and Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		String[] strArray = { "hyd", "banglr", "chennai" ,"Mumbai"};


		System.out.println("******** Print string array **************");
		print(strArray);
		
		System.out.println("******** Print integer array **************");
		print(intArray);
		
		System.out.println("******** Print Double array **************");
		print(doubleArray);
		
		System.out.println("******** Print Character array **************");
		print(charArray);
	}
	
	private static <T> void print(T []  elements) {
		for(T element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}


