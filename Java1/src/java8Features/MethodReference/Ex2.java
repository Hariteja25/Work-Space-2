package java8Features.MethodReference;
/*
 I/p:
List<Integer> numbers = Arrays.asList(1, 8, 90, 89, 2, 7, 10, 1, 90,30,1,3,4,25,76,20,51);


Req:
create new list with only Even Numbers

 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 8, 90, 89, 2, 7, 10, 1, 90,30,1,3,4,25,76,20,51);

		System.out.println("***************** List ************************");
		System.out.println(numbers);

		System.out.println("\n***************** create new list with only Even Numbers ************************");
		List<Integer> evenNos = numbers.stream().filter( n -> n%2==0).collect(Collectors.toList());
		System.out.println(evenNos);
		
		System.out.println("\n***************** create new list with only Odd Numbers ************************");
		List<Integer> OddNos = numbers.stream().filter( n -> n%2!=0).collect(Collectors.toList());
		System.out.println(OddNos);
	}
}




