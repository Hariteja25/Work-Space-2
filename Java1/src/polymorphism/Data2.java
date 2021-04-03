package polymorphism;

public class Data2 {
	public long add(long a, long b ) {
		System.out.println("long,long called");
		long sum = a + b;
		return sum;
	}
	
	public float add(float a, float b ) {
		System.out.println("float,float called");
		float sum = a + b;
		return sum;
	}

}
