package TestService;

import org.junit.Assert;
import org.junit.Test;

import service.Person;
import service.Service;
import service.ServiceException;

public class TestValidatePerson {
	Service service = new Service();

	@Test
	public void testValid() throws ServiceException {
//prepare
		Person p = new Person("user1", 19, "hyderabad", "admin", null, null);
//call method
		boolean res = service.processRegistration(p);

//validate
		Assert.assertTrue("expected succeesul validation", res);
	}
	
	
	//test case when age <18
	@Test(expected= ServiceException.class)
	public void invadlidAge() throws ServiceException {
	//prepare
	Person p = new Person("user1", 15, "hyderabad", "admin", null,null);

	//call the method 
	service.processRegistration(p);
	}
	
	@Test(expected= ServiceException.class)
	public void testInValidACity() throws ServiceException {
	Person p = new Person("user1", 19, "pune", "admin", null,null);
	service.processRegistration(p);
	}
	
	@Test(expected= ServiceException.class)
	public void testInValidCityNull() throws ServiceException {
	Person p = new Person("user1", 19, null, "admin", null,null);
	service.processRegistration(p);
	}
	
}