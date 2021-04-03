package genericMethod;
/*
 Requirement:
write a generic method to print data of any data type
solution:

public static <T> void print(T data) {
		System.out.println(data);
	}
 */

public class GenericMethod1 {
	public static void main(String args[]) {
		print(1);
		print("hello");
		print('h');
		print(12.242424f);
		print(1141414141414144141l);
		print(2424242.242424244242d);
	}

	public static <T> void print(T data) {
		System.out.println(data);
	}
}