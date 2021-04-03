package loops;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// take size as input
	    //  print nos from 1 to the input  
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size");
		int size= sc.nextInt();
		for(int i=1; i<=size; i++){
			System.out.println(i);
		}
	}


	}


