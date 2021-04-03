package service;

public class Calculator {
	
	public int sum(int x,int y) {
		int res=x+y;
		return res;
	}
	
	
	
	public int big(int x,int y) {
		if(x>y) {
			return x;
		}
		else {
			return y;
		}
	}
	
	
	public int div(int a,int b) {
		if (b==0) {
			return 999;
		}
		return a/b;
		
	}
	

}
