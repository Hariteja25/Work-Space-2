package conditions;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//take two strings as input and print whether two strings are equal or not
				Scanner sc = new Scanner(System.in);// sc is point of contact for console

				System.out.println("enter string 1");
				String str1 = sc.next();

				System.out.println("enter string 2");
				String str2 = sc.next();
				/*
				 dont use == for comparing two strings.
				 Use equals() method for comparing two strings. 
				 * */
				if( str1.equals(str2)) {
					System.out.println("strings are equal");
				}else {
					System.out.println("strings are not equal");
				}


	}

}
