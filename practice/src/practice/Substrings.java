package practice;

import java.util.Scanner;

public class Substrings {
	public static void main(String[] args) {
		String s="123456789";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of subString");
		int k=scan.nextInt();
		int count=0;
		for(int i=0;i<s.length()-k;i++) {
			System.out.println(s.substring(i,i+k));
			count++;
		}
		System.out.println("Number of substrings "+count);
	}

}
