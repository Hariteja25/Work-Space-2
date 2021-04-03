package java8Features.MethodReference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex7Sort {
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
		
		System.out.println("***************Print sorting by price*************************");
		//1 create comparator obj
		Comparator<Product> compare = (p1,p2) ->Float.compare(p1.price, p2.price);
		
		//2.apply sorted method
		List<Product> list = productsList.stream().sorted(compare).collect(Collectors.toList());
		
		System.out.println("\n*******************************Print sorting by ASC  price*****************************************");
		//3.print
		list.forEach( p -> System.out.println(p));
		
		System.out.println("***************Print before sorting*************************");
		productsList.forEach( p -> System.out.println(p));
		
		System.out.println("***************Print sorting by price*************************");
		//1 create comparator obj
		Comparator<Product> compare1 = (p1,p2) ->Float.compare(p2.price, p1.price);
		
		//2.apply sorted method
		List<Product> list1 = productsList.stream().sorted(compare1).collect(Collectors.toList());
		
		System.out.println("\n*******************************Print sorting by DESC  price*****************************************");
		//3.print
		list1.forEach( p -> System.out.println(p));
	
	
	}
}
