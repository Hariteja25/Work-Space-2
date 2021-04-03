package java8Features.lambda;

public class TestControllerLambda {
	public static void main(String[] args) {
		//lambda
		Controller c = (name) -> { System.out.println(name); }; 
		c.access("Kumar");
	}

}
