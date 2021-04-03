package oops;

import java.util.Scanner;

public class TestPerson3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // take data as input  and keep inside the Person obj

        // print the data


		 //1. create obj

		        Person p1 = new Person();

		        // p1 has seperate memory for id,name,age

		        

		        

		        Scanner  sc = new Scanner(System.in);

		        

		        System.out.println("enter id");

		        //2.set the data

		        p1.id=sc.nextInt();

		        

		        System.out.println("enter name");

		        p1.name=sc.next();

		        

		        System.out.println("enter age");

		        p1.age=sc.nextInt();

		        

		        //print data

		        System.out.println(p1.id);

		        System.out.println(p1.name);

		        System.out.println(p1.age);

		        

		}

		    

		} 


