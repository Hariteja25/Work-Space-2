package loops;

import java.util.Scanner;

public class Assign2 {
	//take size as input
	//print from input to 1

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size");
		int size= sc.nextInt();
		for(int i=size;i>=1; i--){
			System.out.println(i);
			
		}

	}

}
