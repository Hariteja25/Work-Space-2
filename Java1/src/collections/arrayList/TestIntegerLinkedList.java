package collections.arrayList;
/*
Req: create Linkedlist for Integers.
     store nums inside the Linkedlist.
     print the Linkedlist
*/
      import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

         public class TestIntegerLinkedList {
	 	public static void main(String[] args) {
	 		
	 		//1.Create arraylist for int
	 		List<Integer> nums = new LinkedList<Integer>();
	 		
	 		// 2. add nums
	 		nums.add(10);
	 		nums.add(30);
	 		nums.add(5);
	 		nums.add(56);

	 		// display nos:
	 		System.out.println("******print all nums**********");
	 		for(int n : nums) {
	 			System.out.println(n);
	 		}
	 	}
	 }
