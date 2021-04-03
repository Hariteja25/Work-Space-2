package loops;
/*
 *  1.take input numbers continuosly

	   2.perform the sum of nums
	   3.if sum reaches 100 then stop and display final sum

 */

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// take size as input
		Scanner sc = new Scanner(System.in);
		int sum= 0;
		
		while(sum<100) {
			
			System.out.println("enter num");
			int n1= sc.nextInt();
			sum = sum + n1;
			
		}
		
		
		System.out.println("sum is : "+sum);

	}

}
