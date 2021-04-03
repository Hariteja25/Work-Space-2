package innerClasses;

public class StaticOuter {
	static int data = 30;
	
	int count = 23;

	 // inner class start
	static class Inner {
		void msg() {
			System.out.println("data is " + data);
			//System.out.println(count);cannot acces outer instance 
		}
	}
  //inner class ends

}
// Static inner class can access only static content of outer class

