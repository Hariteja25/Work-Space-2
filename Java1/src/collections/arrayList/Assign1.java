package collections.arrayList;
/*
 Take size as input
take the names for size no of times
store each name inside the ArrayList
finally print all names

 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assign1 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size");
			int size = sc.nextInt();
			List<String> names = new ArrayList<String> ();
			for (int i = 0; i < size ; i++) {
				System.out.println("Enter the name");
				String name = sc.next();
				
				names.add(name);
			}
	
				
			System.out.println("**********print all elements****************");
			for(String d : names) {
			System.out.println(d);
			}
			
			}
}	






