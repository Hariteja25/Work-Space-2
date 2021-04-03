package conditions;

import java.util.Scanner;

public class Biggof3num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);// sc is point of contact for console

		System.out.println("enter num1");
		int n1 = sc.nextInt();
		
		System.out.println("enter num2");
		int n2 = sc.nextInt();
		
		System.out.println("enter num3");
		int n3 = sc.nextInt();
		
		int big = n1; // keep n1 inside big 
		
		//compare n2 & big
		if(n2>big) {
			big = n2;
		}

		//compare n3 & big
		if(n3>big) {
			big = n3;
		}
		
		System.out.println("big  = "+big);


	}

}
