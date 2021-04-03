package java8Features.lambda;

public class TestMathCalcLambda {
public static void main(String[] args) {
	
	MathCalc m  = (a,b) ->  { return a+b;} ;
	int sum = m.add(200, 100);
	System.out.println(sum);
}
}
