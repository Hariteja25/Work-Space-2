package enumClass;

import java.util.Scanner;

public class TestUserType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter usertype");
		String input= sc.next();

		//get all objs
		boolean validUserType = UserType.isValidUserType(input);
		if(validUserType) {
			System.out.println("Valid usertype");
		}else {
			System.out.println("invalid usertype");
		}

	}

}
