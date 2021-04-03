package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		
		
		List<Integer> numbers=Arrays.asList(21,2,3,43,7,25,5,9,67,12,22,43,22,77,89,12,1,21,25);
		
		
		List<Integer> res=numbers.stream().map(n->n*n).sorted(Collections.reverseOrder()).filter(n->n%2!=0).distinct().limit(5).collect(Collectors.toList());
		
		
		System.out.println(res);
		
		
		

	}

}
