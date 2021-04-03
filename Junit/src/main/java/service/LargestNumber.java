package service;

public class LargestNumber  
{  
	public int Maxi(int a ,int b,int c) {

		if(a>=b && a>=c)  {
			return a;  }
		else if (b>=a && b>=c)  {
			return b;  }
		else  {
			return c;  
		}  
	}
}