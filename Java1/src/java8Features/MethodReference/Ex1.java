package java8Features.MethodReference;
/*
 I/p:
List<Integer> numbers = Arrays.asList(1, 8, 90, 89, 2, 7, 10, 1, 90,30,1,3,4,25,76,20,51);


Req:
create new list with square of every no

 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 8, 90, 89, 2, 7, 10, 1, 90,30,1,3,4,25,76,20,51);

		System.out.println("***************** List ************************");
		System.out.println(numbers);

		System.out.println("\n***************** create new list with square of every no ************************");
		
		List<Integer> numsInSquare = numbers.stream().map(n -> n*n ).collect(Collectors.toList());
		//map ; define how to we process each element 
		//collect : terminal specfies where the processed data has to be collected.
		System.out.println(numsInSquare);
		
	}
}
