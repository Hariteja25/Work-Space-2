package java8Features.MethodReference;
/* Sorting Objs
  ---------------------------------
 Req:**
List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		productsList.add(new Product(6, "Dell Laptop", 100000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));


req:
1.create new list by sorting based on id
2.create new list by sorting based on name
3.create new list by sorting based on price

this is the req for custom sorting?

solution:
----------------------------------------------------------
1.create child class for comparator interface
overide compare() method
create the child obj   ============> can be done using lambda
2.call the sorted() method from streams by passing the above comparator obj

 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex5Sort {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		productsList.add(new Product(6, "Dell Laptop", 100000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
         
		
		System.out.println("***************Print before sorting*************************");
		productsList.forEach( p -> System.out.println(p));
		
		System.out.println("***************Print sorting by id*************************");
		//1 create comparator obj
		Comparator<Product> compare = (p1,p2) -> p1.id- p2.id;
		
		//2.apply sorted method
		List<Product> list = productsList.stream().sorted(compare).collect(Collectors.toList());
		
		//3.print
		list.forEach( p -> System.out.println(p));
	
	}
}
