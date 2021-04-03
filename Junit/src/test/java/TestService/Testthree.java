package TestService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import service.LargestNumber;

public class Testthree {
	
	LargestNumber t=new LargestNumber();
	@Test
	public void  test1() {
		
	//1
		
		int x=10;
		int y=20;
		int z=30;
		int expected=30;
		
	//2	
		int actual =t.Maxi(x, y, z);
		
	//3
		Assertions.assertEquals(expected, actual,"Invalid output");
		
		
		
	}
	
	
	@Test
	public void  test2() {
		
	//1
		
		int x=10;
		int y=30;
		int z=20;
		int expected=30;
		
	//2	
		int actual =t.Maxi(x, y, z);
		
	//3
		Assertions.assertEquals(expected, actual,"Invalid output");
		
		
		
	}
	
	
	@Test
	public void  test3() {
		
	//1
		
		int x=30;
		int y=20;
		int z=10;
		int expected=30;
		
	//2	
		int actual =t.Maxi(x, y, z);
		
	//3
		Assertions.assertEquals(expected, actual,"Invalid output");
		
		
		
	}

	@Test
	public void  test33() {
		
	//1
		
		int x=10;
		int y=20;
		int z=5;
		int expected=20;
		
	//2	
		int actual =t.Maxi(x, y, z);
		
	//3
		Assertions.assertEquals(expected, actual,"Invalid output");
		
		
		
	}

	@Test
	public void  test4() {
		
	//1
		
		int x=20;
		int y=20;
		int z=10;
		int expected=20;
		
	//2	
		int actual =t.Maxi(x, y, z);
		
	//3
		Assertions.assertEquals(expected, actual,"Invalid output");
		
		
		
	}
	
	@Test
	public void  test5() {
		
		//1
			
			int x=10;
			int y=20;
			int z=10;
			int expected=20;
			
		//2	
			int actual =t.Maxi(x, y, z);
			
		//3
			Assertions.assertEquals(expected, actual,"Invalid output");
			
			
			
		}
	@Test
	public void  test44() {
		
	//1
		
		int x=10;
		int y=20;
		int z=20;
		int expected=20;
		
	//2	
		int actual =t.Maxi(x, y, z);
		
	//3
		Assertions.assertEquals(expected, actual,"Invalid output");
		
		
		
	}
	@Test
	public void  test444() {
		
	//1
		
		int x=40;
		int y=20;
		int z=10;
		int expected=40;
		
	//2	
		int actual =t.Maxi(x, y, z);
		
	//3
		Assertions.assertEquals(expected, actual,"Invalid output");
		
		
		
	}
	
	@Test
	public void  test55() {
		
		//1
			
			int x=20;
			int y=10;
			int z=10;
			int expected=20;
			
		//2	
			int actual =t.Maxi(x, y, z);
			
		//3
			Assertions.assertEquals(expected, actual,"Invalid output");
			
			
			
		}
	
	
	
	@Test
	public void  test6() {
		
		//1
			
			int x=30;
			int y=20;
			int z=10;
			int expected=30;
			
		//2	
			int actual =t.Maxi(x, y, z);
			
		//3
			Assertions.assertEquals(expected, actual,"Invalid output");
			
	}
	@Test
	public void  test7() {
		
		//1
			
			int x=30;
			int y=20;
			int z=10;
			int expected=30;
			
		//2	
			int actual =t.Maxi(x, y, z);
			
		//3
			Assertions.assertEquals(expected, actual,"Invalid output");
			
	}
			
		
}
