package conditionalStatements;

import java.util.Scanner;

public class Patterns1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
	
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j>=n-1-i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			
			for (int j = 1; j <= n; j++) {
				if (j<=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
