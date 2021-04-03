package loops;

import java.util.Scanner;

public class Assignment9 {
	/* 
	 5 4 3 2 1 
     5 4 3 2 
     5 4 3 
     5 4 
     5 

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// take size as input
				Scanner sc = new Scanner(System.in);
				System.out.println("enter size");
				int size= sc.nextInt();
				
				
				for(int i=0; i<size;i++) {
					int c = 1;
					for(int j=size;  c<=size-i     ;j--, c++) {
						System.out.print(j +" ");
					}
					
					System.out.println();
				}


	}

}
