package innerClasses;

public class TestService2 {
	public static void main(String[] args) {
		
	
    Service s= new Service() {
		
		@Override
		public void process() {
			// TODO Auto-generated method stub
			System.out.println("Hello");
			
		}
	};
	
//creating child class + overriding process() + creating object.
	s.process();
	
    Service s2=new Service() {
		
		@Override
		public void process() {
			// TODO Auto-generated method stub
			System.out.println("Bye");
			
		}
	};
	//creating child class + overriding process() + creating object.
   s2.process(); 
}
}

