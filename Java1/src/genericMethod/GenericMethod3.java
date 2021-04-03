package genericMethod;
/**
Generic method that returns any data type


public static <T> T getData(T data) {
		return data;
	}
<T> ---> generic type
i/p arg is T ===> Method can be called by passing any data type
return type is generic : T 

*/

public class GenericMethod3 {

	public static void main(String args[]) {
		int a1 = getData(1);
		String a2 =getData("hello");
		float a3 =getData(12.242424f);
		long a4= getData(1141414141414144141l);
		double a5 =getData(2424242.242424244242d);
		char a6 =getData('h');
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
	}

	public static <T> T getData(T data) {
		return data;
	}
}
