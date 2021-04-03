package java8Features.lambda;
//remove if the name starts with user1
//solution: use removeIf method
//list.removeIf( data -> data.startsWith("user1"));


import java.util.*;

public class TestForEach3 {

public static void main(String[] args) {

List<String> list = new ArrayList<String>();

list.add("user1");
list.add("user2");
list.add("user3");
list.add("user4");
list.add("user11");
list.add("user21");
list.add("user33");

System.out.println("*******Before removal********");
list.forEach( data -> System.out.println(data));

list.removeIf( data -> data.startsWith("user1"));

System.out.println("*******after removal********");
list.forEach( data -> System.out.println(data));

}
}





