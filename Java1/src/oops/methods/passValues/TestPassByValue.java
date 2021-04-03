package oops.methods.passValues;

public class TestPassByValue {
	public static void main(String[] args) {
		int x= 10;
		
		System.out.println(x);// 10
		
		modify(x);
		
		System.out.println(x);// 10
	}
	
	// if method1() calls method2() by passing primitive variables [int/float/long/double.etc..] 
	//, if the method2() is modifying primitive variable , then it will not have impact on method1()
	
	private static void modify(int num){ // int num = x , the value of 10 is assigned to num
		num = 90;
	}

}
