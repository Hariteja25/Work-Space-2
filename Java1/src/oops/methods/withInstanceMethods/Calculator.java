package oops.methods.withInstanceMethods;
/*Assignment
1.take input for 2 nums and perform operations

2.	Create a calculator class
	and provide
	4 methods:
	sum()
	sub()
	mul()
	div()

1.Calculator   -> sum(), sub(), mul() , div()
2.TestCalcualtor  -> main()
*/

import java.util.Scanner;

public class Calculator {
	
	public void sum(int n1, int n2) {
		System.out.println("sum = "+( n1+n2));
	}

	public void sub(int n1, int n2) {
		System.out.println("sub = "+( n1- n2));
	}

	public void mul(int n1, int n2) {
		System.out.println("mul = "+ (n1*n2));
	}

	public void div(int n1, int n2) {
		System.out.println("div = "+ ( n1/n2));
	}

	}
