package loops;

import java.util.Scanner;

public class Assignment5 {
	/*
	 * take number as input
	 * print multiplication table
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		System.out.println("Multiplication table of"+n);
		for(int i=1;i<=10; i++){
			System.out.println(n+"*"+i+"="+n*i);
		}
		

	}

}
