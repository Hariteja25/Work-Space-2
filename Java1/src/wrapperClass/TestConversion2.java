package wrapperClass;

public class TestConversion2 {
	public static void main(String[] args) {

		// converting String to int
		String intStr = "12";
		int fromInt = Integer.parseInt(intStr);
   
		// 	converting String to float
		String floatstr = "134.00";
		float fromfloat = Float.parseFloat(floatstr);
       
		// converting String to double   
		String doubleStr = "346.00567";
		double fromdouble = Double.parseDouble(doubleStr);
		
   
		// converting String to long
		String longStr = "346877997";
		long fromlong = Long.parseLong(longStr);
		
		String bStr = "true";
		boolean bBoolean= Boolean.parseBoolean(bStr);

		System.out.println(fromInt);
		System.out.println(fromfloat);
		System.out.println(fromdouble);
		System.out.println(fromlong);
		System.out.println(bBoolean);
	}
}
