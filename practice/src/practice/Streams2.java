package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams2 {

public static void main(String[] args) {
List<Integer> numbers = Arrays.asList(1, 8, 90, 89, 2, 7, 10, 1, 90,30,1,3,4,25,76,20,51);

System.out.println("**************** List ***********************");
System.out.println(numbers);

System.out.println("\n***************** create new list by sorting and removing duplicates************************");
List<Integer> numsWithoutDuplicates = numbers.stream().sorted().distinct().collect(Collectors.toList());
System.out.println(numsWithoutDuplicates);

//terminal operations
// demonstration of reduce method
int even =
numbers.stream().filter(x->x%2==0).reduce(0,(x,y)-> x+y);

System.out.println(even);

//terminal operations
// demonstration of forEach method
numbers.stream().forEach(y->System.out.println(y));



Object ar[] =numbers.stream().toArray();
System.out.println(Arrays.toString(ar)); 
// terminal operations
// demonstration of min method
Optional<Integer> minNumber = numbers.stream().min((i, j) -> i.compareTo(j));

System.out.println(minNumber.get());

//terminal operations
// demonstration of max method
Optional<Integer> maxNumber = numbers.stream().max((i, j) -> i.compareTo(j));

System.out.println(maxNumber.get());

//terminal operations
// demonstration of count method
long count=numbers.stream().count();
System.out.println(count);

//terminal operations
// demonstration of findfirst method
Optional<Integer> answer = numbers.stream().findFirst();
System.out.println(answer.get());

//terminal operations
// demonstration of findAny method
Optional<Integer> answer1 = numbers.stream().findAny();
System.out.println(answer1.get());

//terminal operations
// demonstration of anyMatch method
boolean answer2 = numbers.stream().noneMatch(n -> (n * (n + 1)) == 5);

// Displaying the result
System.out.println(answer2);

//terminal operations
// demonstration of allMatch method
boolean answer3 = numbers.stream().allMatch(n-> n % 1 ==0);

// Displaying the result
System.out.println(answer3);



}
}