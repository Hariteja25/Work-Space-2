package loops;

import java.util.Scanner;

public class Assignment10 {
	/*
	 take size as input
	then takes numbers for size no of times.
	and
	find 1.sum 2.sib 3. small

	ex:
	enter size : 4
	enter n1 : 30
	enter n1 : 40
	enter n1 : 50
	enter n1 : 20

	o/p:
	sum : 140
	big : 50
	small : 20

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// take size as input
				Scanner sc = new Scanner(System.in);
				System.out.println("enter size");
				int size= sc.nextInt();
				int sum= 0;
				int big=0;
				int small=0;
				
				for(int i=1; i<=size;i++) {
					
					System.out.println("enter num "+ i);
					int n1 = sc.nextInt();
					sum = sum +n1;
					if(i==1) {
						big=n1;
						small=n1;
					}
					
					
					if(n1>big) {
						big = n1;
					}
					
					if(n1<small) {
						small= n1;
					}
					
				}
				System.out.println("sum = "+sum);
				System.out.println("big = "+big);
				System.out.println("small = "+small);
			}

				
	}


