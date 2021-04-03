package conditions;

import java.util.Scanner;

public class Example9 {

	/**
	 take id (int), age(int) , userType(str) as input.
	 
	 if id & age & userType are valid print valid data
	 if any one of the data is invalid print invalid data
	 
	 
	 */
	public static void main(String[] args) {
		// take id (int), age(int) , userType(str) as input.
		Scanner sc = new Scanner(System.in);// sc is point of contact for console

		System.out.println("enter id");
		int id = sc.nextInt();

		System.out.println("enter age");
		int age = sc.nextInt();

		System.out.println(" enter usertype");
		String userType = sc.next();
		
		// if statement writing multiple conditions using AND  [ && ]
		// if block is executed if ALL THE conditions are satisfied
		if( id>0 && age>18 && userType.equals("admin")) {
			System.out.println("valid data");
		}else {
			System.out.println("invalid data");
		}
		if(id<0 || age<18 || !userType.equals("admin"))
		{
			System.out.println("invalid data");
		}
		else {
			System.out.println("valid data");
		}
	}

}
