package conditions;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//take two nums as input and find the big num
		
				/*
				 conditional statements in java:
				 1. if
				 2. if and else
				 3. if and else if
				 4. switch
				 5. ternary
				 * */
				
				Scanner sc = new Scanner(System.in);// sc is point of contact for console

				System.out.println("enter num1");
				int n1 = sc.nextInt();

				System.out.println("enter num2");
				int n2 = sc.nextInt();
				
				if( n1> n2) {
					System.out.println("big = "+ n1);
				}else {
					System.out.println("big = "+n2);
				}
				


	}

}
