package wrapperClass;

public class TestConversion {
	public static void main(String[] args) {

	// input for primitive data types
	int intValue = 5;
	String intToStrValue = String.valueOf(intValue);
	
	float floatValue = 23f;
	String floatToStrValue = String.valueOf(floatValue);
	
	double doubleValue = 12D;
	String doubleToStrValue = String.valueOf(doubleValue);
	
	long longValue = 56l;
	String longToStrValue = String.valueOf(longValue);

	boolean found= true;
	String foundStr = String.valueOf(found);
	
	System.out.println(intToStrValue);
	System.out.println(floatToStrValue);
	System.out.println(doubleToStrValue);
	System.out.println(longToStrValue);
	System.out.println(foundStr);
	
}
}









