package conditions;

import java.util.Scanner;

public class Assignment2cityname {

	/**
	 take cityname as input 
  	if cityname is "hyd"  or "chennai" or "bangalore" or "mumbai" o/p=> service is provided
  	if cityname is other than what is mentioned above o/p => service is not provided.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// sc is point of contact for console
		System.out.println("enter city name");
		String city = sc.next();
		
		// if statement writing multiple conditions using OR  [ || ]
		// if block is executed if atleast one condition is satisfied
		if(city.equals("hyd")  ||  city.equals("chennai")  ||  city.equals("bangalore") ||  city.equals("mumbai")) {
			System.out.println("service is provided");
		}else {
			System.out.println("servcie is not provided");
		}
		
	}

	}


