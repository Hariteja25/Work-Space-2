package exam;

import java.util.Scanner;

/*
 6.How to check whether the given number is binary or not?
 
 Write a java program to check whether the given number is binary or not.
  A binary number is a number which contains only 0 or 1. For example: 101101, 110010110, 10010011 are binary numbers.

 */
public class Ex6 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	 System.out.println("enter the number");
	 int number=sc.nextInt();
	 String number2=String.valueOf(number);
	 
	 String input="0 || 1";
	 if (number2.contains(input )){
		 System.out.println("binary number");
	 }
	 else {
		 System.out.println("not a binary number");
	 }
}
}
