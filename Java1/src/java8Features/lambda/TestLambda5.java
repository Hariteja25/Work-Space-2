package java8Features.lambda;
/*
 Req:
1.call calculate() method by passing 200,100 and method to return the sum
2.call calculate() method by passing 200,100 and method to return the sub
3.call calculate() method by passing 200,100 and method to return the division

 */

public class TestLambda5 {
	public static void main(String[] args) {
		System.out.println("*************Anonymous inner*********************");
		Calculator c1 = new Calculator() {
			@Override
			public int calculate(int a, int b) {
				return a+b;
			}
		};
		
		int sum1 = c1.calculate(200, 100);
		System.out.println(sum1);
		
		
		System.out.println("*************Lambda*********************");
		Calculator c2  = (a,b) ->  { return a+b;} ;
		int sum = c2.calculate(200, 100);
		System.out.println(sum);
		
		Calculator c3  = (a,b) ->  { return a-b;} ;
		int sub = c3.calculate(200, 100);
		System.out.println(sub);
		
		
		Calculator c4  = (a,b) ->  { return a/b;} ;
		int div = c4.calculate(200, 100);
		System.out.println(div);
	}
}

