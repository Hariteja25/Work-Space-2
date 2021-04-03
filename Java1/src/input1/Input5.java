package input1;

import java.util.Scanner;

public class Input5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//take two nums as input and perform add, mul , sub and div
		
				//take two nums as input
				Scanner sc = new Scanner(System.in);// sc is point of contact for console
				
				System.out.println("enter num1");
				int n1 = sc.nextInt();
				
				System.out.println("enter num2");
				int n2 = sc.nextInt();
				
				//perform operations
				int sum = n1 + n2;
				int sub = n1 - n2;
				int mul = n1 * n2;
				int div = n1 / n2;
				
				//print results
				System.out.println("sum = "+sum);
				System.out.println("sub = "+sub);
				System.out.println("mul = "+mul);
				System.out.println("div = "+div);


	}

}
