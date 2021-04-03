package collections.hashSet;
/*
Req:
Create a linkedhashset for string 
add strings to the linkedhashset
print the elements in the linkedhashset
*/

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestStringLinkedHashSet {
	public static void main(String[] args) {

		//create hashset for strings
		Set<String> names = new LinkedHashSet<String>();
		
		
		//add text in hashset
		names.add("java");
		names.add("sap");
		names.add("hana");
		names.add("apple");
		names.add("zebra");
		names.add("sap");
		names.add("veeru");
		names.add("dotnet");
		names.add("hana");
		names.add("java");
		names.add("sap");
		
		
		//print all
		System.out.println("Entered NAMES ARE :");
		for (String s: names) {
			System.out.println(s);
		}
		
		
	
	}

}
