package practice;

import java.util.Scanner;

public class RandomPassword {

	public static void main(String[] args) {
		
		String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*abcdefghijklmnopqrstuvwxyz";
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the length of the password");
		int size=scan.nextInt();
		String password="";
		for(int i=1;i<=size;i++) {
			int index=(int)(Math.random()*73);
			password=password+s.charAt(index);
		}
		System.out.println("Generated Password");
		System.out.println();
		System.out.println(password);

	}

}
