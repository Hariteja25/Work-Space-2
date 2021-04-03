package collections.arrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
/*
Req: create vector for Integers.
     store nums inside the vector.
     print the vector
*/


public class TestIntegerVector {
	
         
	 	public static void main(String[] args) {
	 		
	 		//1.Create arraylist for int
	 		List<Integer> nums = new Vector<Integer>();
	 		
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


