package conditions;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//take two nums as input and find the small num
				Scanner sc = new Scanner(System.in);// sc is point of contact for console

				System.out.println("enter num1");
				int n1 = sc.nextInt();

				System.out.println("enter num2");
				int n2 = sc.nextInt();
				
				if( n1< n2) {
					System.out.println("small = "+ n1);
				}else {
					System.out.println("small = "+n2);
				}


	}

}
