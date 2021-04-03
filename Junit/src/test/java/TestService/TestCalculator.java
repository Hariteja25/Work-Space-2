package TestService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import service.Calculator;

public class TestCalculator {


	Calculator c=new Calculator();

	@Test
	public void testsum() {	
		//Prepare the data		
		int n1=10;
		int n2=20;
		int expected=30;		
		// Call method
		int actual=c.sum(n1, n2);	
		//Assert the results	
		Assertions.assertEquals(expected, actual,"invalid operation");
		System.out.println("Test complted for positive numbers");
	}

	@Test
	public void testsum_neg() {	
		//Prepare the data		
		int n1=10;
		int n2=-20;
		int expected=-10;		
		// Call method
		int actual=c.sum(n1, n2);	
		//Assert the results	
		Assertions.assertEquals(expected, actual,"invalid operation");
	}
	
	
	
	@Test
	public void testbigx() {	
		//Prepare the data		
		int n1=10;
		int n2=20;
		int expected=20;		
		// Call method
		int actual=c.big(n1, n2);	
		//Assert the results	
		Assertions.assertEquals(expected, actual,"invalid operation");
	}
	
	@Test
	public void testbigy() {	
		//Prepare the data		
		int n1=20;
		int n2=10;
		int expected=20;		
		// Call method
		int actual=c.big(n1, n2);	
		//Assert the results	
		Assertions.assertEquals(expected, actual,"invalid operation");
	}
	
	
	@Test
	public void div1() {	
		//Prepare the data		
		int n1=60;
		int n2=20;
		int expected=3;		
		// Call method
		int actual=c.div(n1, n2);	
		//Assert the results	
		Assertions.assertEquals(expected, actual,"invalid operation");
	}
	
	
	@Test
	public void div2() {	
		//Prepare the data		
		int n1=60;
		int n2=0;
		int expected=999;		
		// Call method
		int actual=c.div(n1, n2);	
		//Assert the results	
		Assertions.assertEquals(expected, actual,"invalid operation");
	}
	
	
	
}
