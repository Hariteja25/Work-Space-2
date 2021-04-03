package loops;
//take size as input
//  print nos from 1 to the input  

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size");
		int size= sc.nextInt();
		int i=1;//init  
		
		while(i<=size) { // condition
			System.out.println(i);
			i++; // increment
		}


	}

}
