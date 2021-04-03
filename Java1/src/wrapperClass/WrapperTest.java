package wrapperClass;

public class WrapperTest {
	public static void main(String[] args) {
		Integer i = new Integer(1313);
		Float f = new Float(12.114f);
		Long l = new Long(13131311);
		Double d = new Double(11313131d);
		Character c = new Character('c');
		Boolean b = new Boolean(true);

	
  	// convert int obj  to int primitive
    int i1 = i.intValue();
    
    // convert float obj  to float primitive
		float f1 = f.floatValue();
    
    	// convert long obj  to long primitive
		long l1 = l.longValue();
    
    // convert double obj  to double primitive
		double d1 = d.doubleValue();

		System.out.println(i1);
		System.out.println(f1);
		System.out.println(l1);
		System.out.println(d1);
	
		
}

}
