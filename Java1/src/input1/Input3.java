package input1;

import java.util.Scanner;

public class Input3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//take string as an input from customer and print the value
		
				//step 1. create scanner obj
				Scanner sc = new Scanner(System.in);// sc is point of contact for console
				System.out.println("enter any string:");
				String name = sc.next();
				
				//step2: print value
				System.out.println("your name is " +name);
				


	}

}
