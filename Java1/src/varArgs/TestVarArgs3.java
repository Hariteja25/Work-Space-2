package varArgs;
/*
  write a var arg function for printing multiple int
 */

public class TestVarArgs3 {
	public static void main(String[] args) {
		System.out.println("------------display-----");
		display(1);
		display(1,2,3);
		display(6,2,3,3); 
		display(1,2,3,33,2);
	}

	public static void display(int... data){
		System.out.println("*******************************");
		for(int v: data){
			System.out.println(v);
		}
	}

}
