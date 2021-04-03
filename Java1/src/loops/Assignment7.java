package loops;

import java.util.Scanner;

public class Assignment7 {
	/*
	 * take size as input
	 * print factorial of the input
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size");
		int size= sc.nextInt();
		int factorial=1;
		
		for(int i=1;i<=size;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("Factorial:"+factorial);

	}

}
