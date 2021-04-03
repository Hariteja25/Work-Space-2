package java8Features.lambda;

public class TestActionLambda {
	public static void main(String[] args) { 
		
	Action a  = (name) ->  { return name;} ;
		String data = a.process("Kumar");
		System.out.println(data);
		
	}

}
