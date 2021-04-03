package collections.arrays;
/*
Create a string array of size 6 and perform
- Insert
- Read by position
- Read all
*/

public class TestStringArrays {
public static void main(String[] args) {
		
		String[] names = new String[6];

		// insert the elements from position 0 TO position 5
		names[0] = "user1";
		names[1] = "kumar";
		names[2] = "ram";
		names[3] = "raj";
		names[4] = "rakul";
		names[5] = "shyam";

		
		//read by position
		System.out.println("********** Read by position **************");
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		System.out.println(names[5]);

		//Read all using enhanced for loop
		System.out.println("********** Read all elements **************");
		for(String d :  names) {
			System.out.println(d);
		}

	}

}
