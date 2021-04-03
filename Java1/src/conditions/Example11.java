package conditions;

import java.util.Scanner;

public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* take username and password as input
		 * if username value is "admin" and password value is "admin", 
		    print login success
		 * else,print login failure
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username:");
		String username=sc.next();
		System.out.println("Enter Password:");
		String password=sc.next();
		 
		if(username.equals("admin") && password.equals("admin"))
		{
			System.out.println("Login success");
		}
		else {
			System.out.println("Login failure");
		}
		
			

	}

}
