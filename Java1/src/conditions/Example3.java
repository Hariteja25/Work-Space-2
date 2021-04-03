package conditions;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//take two nums as input and print whether two nos are equal or not
				Scanner sc = new Scanner(System.in);// sc is point of contact for console

				System.out.println("enter num1");
				int n1 = sc.nextInt();

				System.out.println("enter num2");
				int n2 = sc.nextInt();
				
				if( n1 ==  n2) {
					System.out.println("nums are equal");
				}else {
					System.out.println("nums are not equal");
				}
			}


	}


