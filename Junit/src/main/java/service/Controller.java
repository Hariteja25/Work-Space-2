package service;

import java.util.ArrayList;

public class Controller {

	Service service;

	public String process(Person p) throws ServiceException{
		String status ="";
		if(!p.getAccess().equals("admin"))
			status = "invalid access";

		boolean regStatus = false;
		try{
			regStatus = service.processRegistration(p);
		}catch(ServiceException exception){
			regStatus = false;
			status = exception.getErr();
		}

		if(regStatus)
			return "success";
		else
			return status;
	}

}