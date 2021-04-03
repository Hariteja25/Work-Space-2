package conditions;

import java.util.Scanner;

public class Example5 {

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
				 Use equalsIgnoreCase() method for comparing two strings by ignoring the cases.  [ case insensitive ]
				 * */
				if( str1.equalsIgnoreCase(str2)) {
					System.out.println("strings are equal");
				}else {
					System.out.println("strings are not equal");
				}


	}

}
