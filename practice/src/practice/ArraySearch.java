package practice;

import java.util.Scanner;

public class ArraySearch {
	public static void main(String[] args) {
		//source array
		int names[] ={1,2,3,4,5,6,7,8,9,10};
		
		//take input to search
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the key to search");

                 int input = sc.nextInt();
		
		//compare input with every element inside the array
		 boolean found = false;
		 for(int data : names) {
			if(input==data) {
				found = true;
				break;
			}
		}

		if(found) {
			System.out.println(input + " is available");
		}else {
			System.out.println(input + " is not available");
		}
		 
	}
}


