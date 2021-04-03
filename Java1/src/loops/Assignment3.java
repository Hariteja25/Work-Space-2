package loops;

import java.util.Scanner;

public class Assignment3 {
/*
 * take number as input
 * print all even numbers till input
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		System.out.println("even mumbers:");
		for(int i=1; i<=size; i++){
			if(i%2==0) 
			System.out.println(i);
			
		}
		
		

	}

}
