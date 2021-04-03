package TestService;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import service.Person;
import service.Service;
import service.ServiceException;

public class TestValidatePerson2 {
	Service service = new Service();

	Person p ;

	@Before
	public void setup(){
		p = new Person("user1", 19, "hyderabad", "admin", null,null);
	}

	@Test
	public void testValid() throws ServiceException {

		//call method
		boolean res = service.processRegistration(p);

		//validate
		Assert.assertTrue("expected succeesul validation", res);
	}


	//test case when age <18
	@Test(expected= ServiceException.class)
	public void invadlidAge() throws ServiceException {
		//prepare
		p.setAge(15);
		//call the method 
		service.processRegistration(p);
	}

	@Test(expected= ServiceException.class)
	public void testInValidACity() throws ServiceException {
		p.setCity("pune");
		service.processRegistration(p);
	}

	@Test(expected= ServiceException.class)
	public void testInValidCityNull() throws ServiceException {
		p.setCity(null);
		service.processRegistration(p);
	}

}