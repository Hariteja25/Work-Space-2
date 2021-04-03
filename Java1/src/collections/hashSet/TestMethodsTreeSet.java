package collections.hashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestMethodsTreeSet {
	public static void main(String[] args) {

		Set<String> names = new TreeSet<String>();
		names.add("java");
		names.add("sap");
		names.add("hana");
		names.add("apple");
		names.add("zebra");
		names.add("sap");
		names.add("veeru");
		names.add("dotnet");
		names.add("hana");
		
		//4. display the names
		print(names);
		
		//serach by content
		boolean contains = names.contains("user1");
		System.out.println(contains);
		
		//add new element
		names.add("user2");
		print(names);
		
		//is empty check
		System.out.println("is empty check = "+names.isEmpty() );
		
		//remove element
		names.remove("user2");
		print(names);
		
		//find length
		int len = names.size();
		System.out.println("size = "+ len);
		
		//delete all elements
		names.clear();
		
		//is empty check
		System.out.println("is empty check = "+names.isEmpty() );
		System.out.println("size ="+names.size() );
	
	}

	private static void print(Set<String> names) {
		System.out.println("******************Elements in Set are:: ************************************");
		for(String p : names){
			System.out.println(p);
		}
	}

}
