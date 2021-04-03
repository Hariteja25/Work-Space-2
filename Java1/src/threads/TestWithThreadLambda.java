package threads;
/*
 Req:
take two nos as input and perform
	 add
	 mul
	 sub
	 div
using threads
 */

import java.util.Scanner;
public class TestWithThreadLambda {

	 public static void main(String[] args) {
		 System.out.println("main starts");
		Scanner sc = new Scanner(System.in);

		//take inputs
		System.out.println("Enter 2 nums");
		int num1 =  sc.nextInt();
		int num2 =  sc.nextInt();

		//create 4 annnymous class + objects
		Runnable r1 = () -> {
			System.out.println("sum = "+ (num1+num2));
		};
		
		Runnable r2 = () -> {
			System.out.println("sub = "+ (num1-num2));
		};
		
		Runnable r3 = () -> {
			System.out.println("mul = "+ (num1*num2));
		};
		
		Runnable r4 = () -> {
			System.out.println("div = "+ (num1/num2));
		};
		
		//create ANS start thread objects
		  new Thread(r1,"add thread").start(); 
		  new Thread(r2,"sub thread").start();
		  new Thread(r3,"mul thread").start();
		  new Thread(r4,"div thread").start();
		
		System.out.println("main ends");
		
	}
}