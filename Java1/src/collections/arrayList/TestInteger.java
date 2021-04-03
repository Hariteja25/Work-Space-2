package collections.arrayList;
/*
Req: create arraylist for Integers.
     store nums inside the arraylist.
     print the arraylist
*/
      import java.util.ArrayList;
	 import java.util.List;

         public class TestInteger {
	 	public static void main(String[] args) {
	 		
	 		//1.Create arraylist for int
	 		List<Integer> nums = new ArrayList<Integer>();
	 		
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



