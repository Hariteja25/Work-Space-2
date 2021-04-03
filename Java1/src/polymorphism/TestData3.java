package polymorphism;

public class TestData3 {
	public static void main(String[] args) {
		//create obj
		Data3 data = new Data3();
		
		long v1 = data.add(345445454L, 243535325L);  // two long
		System.out.println(v1);
		
		long v2 = data.add(5, 6); // two int
		System.out.println(v2);
		
	}

}
