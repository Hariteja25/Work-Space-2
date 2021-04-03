package collections.arrayList;
/*
 Ex2:[ arraylist/Vector/LinkedList ]
dont take size
enter the name 
store every name inside the arraylist
if name value is "END" then stop taking the input
finally print all names
 */

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	public class Assign2 {
			public static void main(String[] args) {

				
				List<String> names = new ArrayList<String> ();
				while(true) {
					System.out.println("Enter the name");
					Scanner sc = new Scanner(System.in);
					String name = sc.next();
					if ("END".equals(name)) {
						break;

					}
					names.add(name);
					
				}
				// display names:
				System.out.println("******print all names**********");
				for(String n: names) {
					System.out.println(n);
				}
			}
			}

