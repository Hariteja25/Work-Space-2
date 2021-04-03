package practice;


public class TestService2 {

	public static void main(String[] args) {
		Service s1 =  new Service() {
			@Override
			public void save() {
				System.out.println("Hello");
			}
		};
		
		s1.save();
		
		Service s2 = new Service() {
			
			@Override
			public void save() {
				System.out.println("Bye");
			}
		};
		s2.save();
	}
}

