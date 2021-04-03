package java8Features.lambda;
/*
 Req:
call the process method and Print HI
call the process method and Print hello
call the process method and Print welcome

solution:
1.anonymous inner class
OR
2.Lambda expressions
 */

//() =====> the input args 
		// before the "->" is the input args for the method to override
		// after the "->" is the logic  for the method to override
public class TestLambda1 {
	public static void main(String[] args) {

		 //using anonymous inner class
		Service s= new Service() {
			@Override
			public void process() {
				System.out.println("Hi");
			}
		}; //create child class + override method + create obj
		s.process();
		
		
		//using lambda expression
		Service s1= () -> { 	System.out.println("Hi");  };
		//create child class + override method + create obj
		
		// before the "->" is the input args for the process() method.
		// after the "->" is the logic  for the process() method.
		
		s1.process();
	}
}
