package java8Features.MethodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
/*
 I/p:
List<Integer> numbers = Arrays.asList(1, 8, 90, 89, 2, 7, 10, 1, 90,30,1,3,4,25,76,20,51);


Req:
create new list by getting 1st 5 nums

 */

public class Ex6 {
	 public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 8, 90, 89, 2, 7, 10, 1, 90,30,1,3,4,25,76,20,51);

		System.out.println("***************** List ************************");
		System.out.println(numbers);

		System.out.println("\n***************** create new list by getting 1st 5 nums ************************");
		List<Integer> collect = numbers.stream().limit(5).collect(Collectors.toList());
		System.out.println(collect);
		
		System.out.println("\n***************** create new list sort the data and get 1st 5 nums ************************");
		collect = numbers.stream().sorted().limit(5).collect(Collectors.toList());
		System.out.println(collect);
		
		System.out.println("\n***************** create new list remove duplicates() sort the data and get 1st 5 nums ************************");
		collect = numbers.stream().distinct().sorted().limit(5).collect(Collectors.toList());
		System.out.println(collect);
		
	}
   
}




