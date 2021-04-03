package methods;

import java.util.Scanner;

public class Biggof3num {
	public static void main(String[] args) {
		Operations op = new Operations();
		
		//take input for three no's
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no:1");
		int n1 = sc.nextInt();
		
		System.out.println("enter no:2");
		int n2 = sc.nextInt();
		
		
		System.out.println("enter no:3");
		int n3 = sc.nextInt();
		
		
		//find big of n1 & n2
		int large  = op.big(n1, n2);
		//then compare with n3
		large = op.big(large, n3);
		System.out.println(large);
		
		
		int big1  = op.big(n1, op.big(n2, n3)); 
		System.out.println(big1);
		
	}

}
