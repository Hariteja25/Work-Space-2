package java8Features.lambda;

import java.util.*;

//print in upper case
public class TestForEach2 {

public static void main(String[] args) {

List<String> list = new ArrayList<String>();

list.add("user1");
list.add("user2");
list.add("user3");
list.add("user4");
list.add("user11");
list.add("user21");
list.add("user33");

//print all
System.out.println("************************convert to upper case using enhanced for loop************************");
for(String data: list) {
System.out.println(data.toUpperCase());
}

//forEach expects lambda arg: each element , expression: print
System.out.println("************************convert to upper case using foreach ************************");
list.forEach( data -> System.out.println(data.toUpperCase()) );

}
}






