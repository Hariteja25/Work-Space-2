package collections.arrayList;
/**
Req: create ArrayList for String.
     store strings inside the ArrayList.
     print the ArrayList
*/

import java.util.ArrayList;
import java.util.List;


public class TestStringArrayList {
	public static void main(String[] args) {
			
			//1.Create arraylist for String
			List<String> names = new ArrayList<String>();
			
			// 2. add names
			names.add("kumar");
			names.add("ram");
			names.add("raj");
			names.add("shyam");
			names.add("teju");
			
			
			// display names:
			System.out.println("******print all names**********");
			for(String n: names) {
				System.out.println(n);
			}
		}
}
