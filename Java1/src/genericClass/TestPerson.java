package genericClass;

public class TestPerson {
	public static void main(String[] args) {

		//person to hold String
		Person<String> p1 = new Person<>();//  T will be String
		p1.set("kumar");
		System.out.println(p1.get());
		
	}
}



