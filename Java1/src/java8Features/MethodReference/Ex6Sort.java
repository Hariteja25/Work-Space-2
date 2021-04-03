package java8Features.MethodReference;
/*
 //HERE P1, P2 ARE PRODUCT Objs
Comparator<Product> compare = (p1,p2) -> p1.id- p2.id;  //sort by id asc
Comparator<Product> compare = (p1,p2) -> p2.id- p1.id;	//sort by id DESC order
Comparator<Product> compare = (p1,p2) -> p1.name.compareTo(p2.name); //sort by name asc 
Comparator<Product> compare = (p1,p2) -> p2.name.compareTo(p1.name); //sort by name desc

//2.apply sorted method
List<Product> list = productsList.stream().sorted(compare).collect(Collectors.toList());
		
//3.print
list.forEach( p -> System.out.println(p));
    
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex6Sort {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		productsList.add(new Product(6, "Dell Laptop", 100000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
         
		
		System.out.println("****************************************Print before sorting***************************************");
		productsList.forEach( p -> System.out.println(p));
		
		System.out.println("\n*******************************Print sorting by ASC id*****************************************");
		//1 create comparator obj
		Comparator<Product> compare = (p1,p2) -> p1.id- p2.id;
		
		//2.apply sorted method
		List<Product> list = productsList.stream().sorted(compare).collect(Collectors.toList());
		
		//3.print
		list.forEach( p -> System.out.println(p));
		
		
		
		System.out.println("\n*******************************Print sorting by DESC id*****************************************");
		//1 create comparator obj
		compare = (p1,p2) -> p2.id- p1.id;
		
		//2.apply sorted method
		list = productsList.stream().sorted(compare).collect(Collectors.toList());
		
		//3.print
		list.forEach( p -> System.out.println(p));
		
		
		System.out.println("\n*******************************Print sorting by ASC  name*****************************************");
		//1 create comparator obj
		compare = (p1,p2) -> p1.name.compareTo(p2.name);
		
		//2.apply sorted method
		list = productsList.stream().sorted(compare).collect(Collectors.toList());
		
		//3.print
		list.forEach( p -> System.out.println(p));
		
		
		System.out.println("\n*******************************Print sorting by DESC  name*****************************************");
		//1 create comparator obj
		compare = (p1,p2) -> p2.name.compareTo(p1.name);
		
		//2.apply sorted method
		list = productsList.stream().sorted(compare).collect(Collectors.toList());
		
		//3.print
		list.forEach( p -> System.out.println(p));
	
	}
}
