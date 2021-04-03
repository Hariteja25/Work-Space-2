package loops;

import java.util.Scanner;

public class Assign3even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// take size as input
				Scanner sc = new Scanner(System.in);
				System.out.println("enter size");
				int size= sc.nextInt();
				
				for(int i=2; i<=size; i = i+2){
						System.out.println(i);
				}


	}

}
