package oops.methods.withInstanceMethods;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {
		// create the obj
		Calculator c1 = new Calculator();
		
		System.out.println("****c1 obj operations *****");
		int a=90;
		int b=40;
				
		//call methods using obj
		c1.sum(a,b);
		c1.sub(a,b);
		c1.div(a,b);
		c1.mul(a,b);

		

		}}