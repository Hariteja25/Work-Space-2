package collections.arrays;
/*
 search by content.
 */

import java.util.Scanner;

public class ArraySearch {
	public static void main(String[] args) {
		//source array
		String names[] ={"user1","user2","user3","user4","user5","user6","user7"};
		
		//take input to search
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the key to search");
		String input = sc.next();
		
		//compare input with every element inside the array
		boolean found = false;
		for(String data : names) {
			if(input.equals(data)) {
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
