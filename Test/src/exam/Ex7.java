package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 7.Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order. 
Example Input: [-4,-1,0,3,10]
              Output: [0,1,9,16,100]
 

 */
public class Ex7 {
	public static void main(String[] args) {
		List<Integer> input=new ArrayList<Integer>();
		input.add(-4);
		input.add(-1);
		input.add(0);
		input.add(3);
		input.add(10);
		List<Integer> output=input.stream().map(n->n*n).sorted().collect(Collectors.toList());
		System.out.println(output);
	}

}
