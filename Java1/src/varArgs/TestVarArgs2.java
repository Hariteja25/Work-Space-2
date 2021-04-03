package varArgs;
/*
 Req:
write a var-arg funtion that performs sum of any numbers.

 */

public class TestVarArgs2 {
	public static void main(String[] args) {
		System.out.println(getSum(12, 13));
		System.out.println(getSum(1,2,3,4,5,6,7,8));
		System.out.println(getSum(12));
		System.out.println(getSum(23,24,25,1,1,1,1,1,4,1,1,1,24,1));
		
	}
	
	public static int getSum(int... data){
		int sum= 0;
		for(int v: data){
			sum = sum+v;
		}
		return sum;
	}
	
}
/*  Assignment
Req:
 
  
  write a var arg function for findling big of  multiple int
  write a var arg function for findling small of  multiple int

*/