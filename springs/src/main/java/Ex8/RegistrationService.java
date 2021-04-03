package Ex8;


import java.util.Map;
import java.util.Map.Entry;

public class RegistrationService {

	Map<String, String> props;

	public RegistrationService(Map<String, String> props) {
		super();
		this.props = props;
	}


	public void process() {
    	for(Entry<String, String> entry : props.entrySet()) 
    	{
    		System.out.println(entry.getKey()+" - "+entry.getValue());
    		
    	}
	}
	
}

/**
RegistrationService is a bean class.
RegistrationService has "props"(map) as dependency.
spring has to create the obj for RegistrationService and set the data "props"(map) as dependency..
since we are using constr injection we need to write the constructor in RegistrationService
and write bean tag with one constructor-arg tags in springs.xml.
 */
 