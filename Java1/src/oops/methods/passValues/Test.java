package oops.methods.passValues;

public class Test {
	public static void main(String[] args) {
		int x = 90;
		System.out.println(x); // 90

		int y = x;// assign the value of x to y
		System.out.println(y); // 90

		y = 45; // change y , x will not change
		System.out.println(x);// 90
		System.out.println(y); // 45
	}

}
