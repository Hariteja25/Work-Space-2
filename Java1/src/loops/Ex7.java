package loops;
/*
1.take input numbers continuosly
2.perform the sum of nums
3.if sum reaches 100 then stop and display final sum
4.if the input is negative no; then dont perform any sum
5. if the input is 999 , then stop prog
break; we can use inside the loops;
if break statement is executed then control will come out of the loop.....
* */

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// take size as input
				Scanner sc = new Scanner(System.in);
				int sum= 0;
				
				while(sum<100) {
					
					System.out.println("enter num");
					int n1= sc.nextInt();

					if(n1 < 0) {
						continue;// stop the current run and go to the next run.....
					}
					
					if(n1==999) {
						break;// stop all the runs and come out of the loop
					}
					sum = sum + n1;
				}
				System.out.println("sum is : "+sum);

	}

}
