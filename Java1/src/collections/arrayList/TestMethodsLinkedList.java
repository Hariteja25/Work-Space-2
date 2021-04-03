package collections.arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestMethodsLinkedList {
	public static void main(String[] args) {
		List<String> names = new LinkedList<String>();
		
		//add 3 elements
		names.add("user1"); // add new element
		names.add("user4"); // add new element
		names.add("user5"); // add new element

		//print
		print(names);

		names.add(2, "user2"); // adds new element at 3rd position
		// ---> stores as user1,user2,user4,user5

		print(names);
		
		String data = names.get(1); // search by position . ex: gets the element at 2nd position.
		System.out.println(" element at 2nd position = " + data);
		
		boolean found = names.contains("user1"); // returns boolean , search by content
		System.out.println(" serach by content for user1 = " + found);
		
		int count = names.size(); // to find size
		System.out.println(" no of elements =  " + count);
		
		names.remove("user2"); // to remove element
		print(names);

		System.out.println(" is empty check : "+names.isEmpty()); // false
		names.clear(); // deletes all elements
		print(names);
		System.out.println(" is empty check : "+names.isEmpty()); // true
	}
	
	private static void print(List<String> names) {
		//3. display names:
		System.out.println("\n******print all names : start **********");
		for(String n: names) {
			System.out.print(n + " - ");
		}
		System.out.println("\n");
	}
	
	//int po = names.indexOf("user1"); // returns the position number for the given data.
	//boolean content = names.isEmpty(); // returns boolean to check whether list is empty or not
}


