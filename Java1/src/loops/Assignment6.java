package loops;

import java.util.Scanner;

public class Assignment6 {
	/*
	 * take size as input
	 * print sum of numbers from 1 to input
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size");
		int size= sc.nextInt();
		int sum=0;
		for(int i=1;i<=size;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum="+sum);

	}

}
