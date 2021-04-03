package java8Features;
public class ServiceTest   {
	public static void main(String[] args) {
		Service  s = new Service() {
			@Override
			public void process(String str) {
				System.out.println("you data = "+ str);
			}
		};
		
		s.process("kunmar");
		s.process("ram");
	}
}

