package service;

import java.util.ArrayList;
import java.util.List;

public class Service {

	
	private List<String> names = new ArrayList<>();
/**
* Returns true if city value is "bangalore","hyderabad" , "chennai".
* Returns false for any other city.
*
* @param city
* @return
*/
public boolean isValidCity(String city) {
if ("bangalore".equalsIgnoreCase(city) ||
"hyderabad".equalsIgnoreCase(city)
|| "chennai".equalsIgnoreCase(city)) {
return true;
}
return false;
}

public boolean processRegistration(Person person) throws ServiceException {
if (person.getAge() < 18) {
throw new ServiceException("Age should be > 18");
}

String city = person.getCity();
if (!isValidCity(city)) {
throw new ServiceException("Invalid city");
}

return true;
}



public void addEntry(String name) {
if(name!=null && !"".equals(name)) {
getNames().add(name);
}
}

public List<String> getNames() {
	return names;
}

public void setNames(List<String> names) {
	this.names = names;
}

}