package loops;

import java.util.Scanner;

public class Assignment8 {
	/*
	   1
	   1 2
	   1 2 3
	   1 2 3 4
	   1 2 3 4 5
	  
	 */
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// take size as input
				Scanner sc = new Scanner(System.in);
				System.out.println("enter size");
				int size= sc.nextInt();
				

				for(int i=1; i<=size;i++) {
					for(int j=1; j<=i;j++) {
						System.out.print(j +" ");
					}
					System.out.println();
				}


	}

}
