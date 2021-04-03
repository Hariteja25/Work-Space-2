package java8Features;

public class TestController   {

	public static void main(String[] args) {
		// call the static method
		Controller.print("login started");
		Controller.print("login failed");
		
		Controller  cObj = new Controller() {
			
			@Override
			public void process1(String str) {
				System.out.println("process1 execution completed for "+str);
			}
			
			@Override
			public void process(String str) {
				System.out.println("process execution completed for "+str);
			}
		};
		cObj.process("ram");
		cObj.process1("sharma");
		
	}
	// create class + provide methods + create obj ===> anonymous inner class

}
	
	

