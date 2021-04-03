package practice;

import java.math.BigInteger;

public class big_integer {

public static void main(String[] args) {
	
	int n=20;
	BigInteger fact=new BigInteger("1");
	for(int i=1;i<=n;i++) {
		fact=fact.multiply(BigInteger.valueOf(i));
	}
	System.out.println(fact);
	
	
	
	System.out.println("***********************************************************");
	
	BigInteger p=new BigInteger("7");
	System.out.println(p.isProbablePrime(n));
	
}

}



