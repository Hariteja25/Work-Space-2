package TestService;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import service.Service;

public class TestServiceAddEntry {

	Service service =new Service();

	/*
	 * @Before public void before() { service= new Service(); }
	 */

	@Test
	public void test1() {
		service.addEntry("Hello");
		Assert.assertEquals(service.getNames().size() , 1);
		Assert.assertEquals(service.getNames().get(0) , "Hello");
	}
	
	@Test
	public void test2() {
		service.addEntry(null);

		Assert.assertEquals(service.getNames().size() , 0);
	}

	@Test
	public void test3() {
		service.addEntry("");
		Assert.assertEquals(service.getNames().size() , 0);
	}


}