package dateOperations;
/*
 dd-MM-yy	31-01-12
	dd-MM-yyyy	31-01-2012
	MM-dd-yyyy	01-31-2012
	yyyy-MM-dd	2012-01-31
	yyyy-MM-dd HH:mm:ss	2012-01-31 23:59:59
	yyyy-MM-dd HH:mm:ss.SSS	2012-01-31 23:59:59.999
	yyyy-MM-dd HH:mm:ss.SSSZ	2012-01-31 23:59:59.999+0100
	EEEEE MMMMM yyyy HH:mm:ss.SSSZ	Saturday November 2012 10:45:42.720+0100
	
	yyyy => 4 digit year
 MM   => 2 digit month (you must type MM in ALL CAPS)
 dd   => 2 digit "day of the month"

 HH   => 2-digit "hour in day" (0 to 23)
 mm   => 2-digit minute (you must type mm in lowercase)
 ss   => 2-digit seconds
 SSS  => milliseconds
 
 */
/*
 Steps:
------------- 
 1.create date obj
 2.specify the date format 
 3.create the SimpleDateFormat object using the date format
 4.call the format() method using SimpleDateFormat object  by passing the date obj
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex2 {
public static void main(String[] args) {
	Date dateObj = new Date();
	
	String pattern = "MMMMM dd yyyy  HH:mm:ss";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	
	String date = simpleDateFormat.format(dateObj);
	System.out.println(date);	
}
}

 