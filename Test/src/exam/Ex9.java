package exam;

import java.util.ArrayList;
import java.util.List;

/*
 9.Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example: Given nums = [2, 7, 11, 15], target = 9,
              Because nums[0] + nums[1] = 2 + 7 = 9,
        return [0, 1].

 */
public class Ex9 {
	public static void main(String[] args) {
		int[] input=new int[4];
		input[0]=2;
		input[1]=7;
		input[2]=11;
		input[3]=15;
		int output=input[0]+input[1];
		System.out.println(output);
}
}