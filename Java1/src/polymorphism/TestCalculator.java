package polymorphism;

public class TestCalculator {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		int sum1=cal.add(5,6); 
		System.out.println(sum1);
		
		int sum2 = cal.add(1,2,3);
		System.out.println(sum2);
		
		long sum3 = cal.add(343535l, 525252l);
		System.out.println(sum3);
		
	 	float sum4 = cal.add(12f,  10.0f);
		System.out.println(sum4);
		
		long sum5 = cal.add(12l, 10l);
		System.out.println(sum5);
		
	}
/*
 return-type is never considered as method signature
 public long add(long a, long b ) {
		long sum = a + b;
		return sum;
	}
 	
	public int add(long a, long b ) {
		long sum = a + b;
		return sum;
	}

 */

}
