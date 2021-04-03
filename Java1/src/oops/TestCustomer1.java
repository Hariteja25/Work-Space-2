package oops;

import java.util.Scanner;

public class TestCustomer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1=new Customer();
		
		  Scanner  sc = new Scanner(System.in);
		  
		  System.out.println("enter fname");
		  c1.fname=sc.next();
		  System.out.println("enter lname");
		  c1.lname=sc.next();
		  System.out.println("enter mobile");
		  c1.mobile=sc.nextInt();
		  System.out.println("enter email");
		  c1.email=sc.next();
		  System.out.println("enter city");
		  c1.city=sc.next();
		  
		  System.out.println(c1.fname);
			System.out.println(c1.lname);
			System.out.println(c1.mobile);
			System.out.println(c1.email);
			System.out.println(c1.city);
		  
			  

	}

}
