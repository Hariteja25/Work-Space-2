package input1;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//take input from customer and print the value
		
				//step 1. create scanner obj
				Scanner sc = new Scanner(System.in);// sc is point of contact for console
				
				System.out.println("enter a float:");
				float x = sc.nextFloat();// store input inside the variable x
				System.out.println("your float input is :"+x);
				
				
				System.out.println("enter a long:");
				long y = sc.nextLong();// store input inside the variable x
				System.out.println("your long  input is :"+y);
				
				
				
				System.out.println("enter a double:");
				double z= sc.nextDouble();// store input inside the variable x
				System.out.println("your double  input is :"+z);
				
				
				


	}

}
