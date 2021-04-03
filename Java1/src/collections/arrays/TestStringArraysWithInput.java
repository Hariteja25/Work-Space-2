package collections.arrays;
/*
 /*
  - Take size as input
  - Take input for size number of times and store every data inside the array
  - display the data using the array.
 
 */

import java.util.Scanner;

public class TestStringArraysWithInput {
	public static void main(String[] args) {
		// 1. input size
		System.out.println("Enter the size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		// 2. declare the array with size
		String [] names = new String[size];
		
		// 3. input the numbers
		for(int i=0; i< size ; i++) {
			System.out.println("Enter names : "+  (i+1));
			String name = sc.next();
			names[i] = name;
		}

		// display integers
		System.out.println("**********print all elements****************");
		for(String d : names) {
			System.out.println(d);
		}
	}
/*
 1.take numbers and print in sorting order.

2.search by content
array :: 1 3 5 6 8 
i/p: 5
o/p: element found

i/p: 10
o/p: element not found
 */

}
