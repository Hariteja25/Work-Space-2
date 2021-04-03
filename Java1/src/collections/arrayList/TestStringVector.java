package collections.arrayList;
/**
Req: create Vector for String.
     store strings inside the Vector.
     print the Vector
*/
import java.util.Vector;
import java.util.List;


public class TestStringVector {
	public static void main(String[] args) {
			
			//1.Create Vector for String
			List<String> names = new Vector<String>();
			
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