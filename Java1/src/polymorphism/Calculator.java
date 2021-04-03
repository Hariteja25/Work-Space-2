package polymorphism;
//ctrl+o---shows no of methods.
public class Calculator {
	// no of args
		public int add(int a, int b) {
			System.out.println("called add(int a, int b)");
			int sum = a + b;
			return sum;
		} 
		
	 	public int add(int a, int b , int c) {
	 		System.out.println("called add(int a, int b , int c)");
			int sum = a + b+c;
			return sum;
		}

	 	//data type of args
	 	public long add(long a, long b ) {
	 		System.out.println("called add(long a, long b )");
			long sum = a + b;
			return sum;
		}
	 	
		public float add(float a, float b ) {
			System.out.println("called add(float a, float b )");
			float sum = a + b;
			return sum;
		}
		
		//order of args
		public void add(int a, float b ) {
			System.out.println("called add(int a, float b )");
			System.out.println(a + b);
		}
		
		public void add(float a, int b ) {
			System.out.println("called add(float a, int b )");
			System.out.println(a + b);
		}

}
