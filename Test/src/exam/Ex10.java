package exam;
/*
 10.Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
                Example:Input: [0,1,0,3,12]
               Output: [1,3,12,0,0]

 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex10 {
	public static void main(String[] args) {
		List<Integer> input=new ArrayList<Integer>();
		input.add(0);
		input.add(1);
		input.add(0);
		input.add(3);
		input.add(12);
		List<Integer> output=input.stream().sorted().collect(Collectors.toList());
		System.out.println(output);
	}

}
