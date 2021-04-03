package loops;

import java.util.Scanner;

public class Assign6sumofnum {
	/*
	 * take size as input
	 * print sum of numbers from 1 to input
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// take size as input
				Scanner sc = new Scanner(System.in);
				System.out.println("enter size");
				int size= sc.nextInt();
				 /*
				   n * (n+1)/2
				  * */
				int sum = size * (size+1)/2; 
				
				System.out.println("sum = "+sum);

	}

}
