package collections.hashSet;
/*
  Req:
 Take multiple string as input
 add the string to the hashset
 if the input value is "END" stop taking the input
 
 print the elements from the set
 
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestStringHashsetWithInput {
	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		
		Scanner sc = new Scanner(System.in);
		
		// input string till 'END' is encountered
		while(true) {
			System.out.println("enter name:");
			String name = sc.next();
			
			if(name.equals("END")) {
				break;
			}
			
			names.add(name);
		
		}
		 
		// 4. display the names
		System.out.println("******************printing all the names**********************");
		for(String s: names) {
			System.out.println(s);
		}

	}
}


