package varArgs;
/*
 write a var arg function for printing multiple float
 */
public class TestVarArgs4 {

	public static void main(String[] args) {
		System.out.println("------------display-----");
		display(12.2f);
		display(1.44f,2.449f,3.340f);
		display(6.23f,2.40f,3.34f,3.44f); 
		display(1.12f,2.34f);
	}

	public static void display(float... data){
		System.out.println("*******************************");
		for(float v: data){
			System.out.println(v);
		}
	}
}
