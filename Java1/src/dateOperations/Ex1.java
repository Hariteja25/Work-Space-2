package dateOperations;
/*
Ex1-
1.import java.util.Date;
2.create the date object
ex: Date d1 = new Date(); // point to currrent date and time
*/
import java.util.Date;

public class Ex1 {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println("date is " + d1);
	
		Date d2 = new Date(111111111111L); // create date using milliseconds
		System.out.println("Date is " + d2);
	}
}

