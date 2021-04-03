package exam;
/*
 
2.Write a program to sort a Treemap in reverse order using comparator.

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Ex2 {
	Map<Integer,Integer> input=new TreeMap();
	input.put(1,100);
	input.put(2,300);
	input.put(3,400);
	input.put(4,600);
	
	
	
	Map<Integer,Integer> output=input.stream().sorted().collect(Collectors.toList());
	System.out.println(output);

}
