package java8Features.MethodReference;
/*
  Req:
  call process() method and print Hello User
  call process() method and print Welcome User
  call process() method and print Bye


 */

public class TestService {
	public static void main(String[] args) {
		
		System.out.println("******************approach1 using lambda********************************");
		//approach1 using lambda
		Service s = () -> {System.out.println("Hello User");};
		s.process();
		
		s = () -> {System.out.println("Welcome User");};
		s.process();
		
		s = () -> {System.out.println("Bye");};
		s.process();
		
		
		System.out.println("******************approach1 using method reference********************************");
		//approch2 using method reference
		
		//method reference for static method
		Service s1 = Data :: execute1;
		s1.process(); // invokes execute1() method for Data class
		
		//method reference for instance method
		s1 = new Data() :: execute2;
		s1.process();// invokes execute2() method for  Data class
		
		//method reference for constr
		s1 =  Data :: new;
		s1.process();// invokes constructr() for Data class
	}
}

 


 