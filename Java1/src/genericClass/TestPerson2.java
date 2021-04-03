package genericClass;

public class TestPerson2 {
	public static void main(String[] args) {

		//person to hold integer
		Person<Integer> p1 = new Person<>();//  T will be Integer
		p1.set(1234);
		
		int num = p1.get();
		System.out.println(num);
		
	}
}




