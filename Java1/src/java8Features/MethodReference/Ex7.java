package java8Features.MethodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ex7 {
	
  public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 8, 90, 89, 2, 7, 10, 1, 90,30,1,3,4,25,76,20,51);

		System.out.println("***************** List ************************");
		System.out.println(numbers);

		System.out.println("\n***************** limit 5   ************************");
		List<Integer> collect = numbers.stream().limit(5).collect(Collectors.toList());
		System.out.println(collect);
		
		//skip     -> how many results to ignore
		//limit    -> specifies the count of results
		
		System.out.println("\n***************** skip with limit  ************************");
		//skip with limit  -> skip 1 result from entire list and then limit to 5
		collect = numbers.stream().skip(1).limit(5).collect(Collectors.toList());
		System.out.println(collect);
		
		System.out.println("\n***************** limit with skip  ************************");
		//limit with skip -> limit 5  from entire list and then skip the 1st result out of 5
		collect = numbers.stream().limit(5).skip(1).collect(Collectors.toList());
		System.out.println(collect);
		
		
	}
}