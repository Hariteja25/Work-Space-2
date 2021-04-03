package conditions;

import java.util.Scanner;

public class Bigof3num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);// sc is point of contact for console

		System.out.println("enter num1");
		int n1 = sc.nextInt();

		System.out.println("enter num2");
		int n2 = sc.nextInt();
		
		System.out.println("enter num3");
		int n3 = sc.nextInt();
		
		if( n1> n2 &&  n1>n3) {
			System.out.println("big = "+ n1);
		}else if(n2>n3) {
			System.out.println("big = "+n2);
		}
		else {
			System.out.println("big="+n3);
		}

	}

}
