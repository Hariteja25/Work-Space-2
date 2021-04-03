package Ex17lifecycle;

/*
how to define global init method and also kind of interceptor:
[common init method for all bean classes ]

steps:
1.create class that implements BeanPostProcessor interface 
and override postProcessAfterInitialization() and postProcessBeforeInitialization().
2.Register in springs.xml

*/
public class CustomerService {

	public CustomerService(){
		System.out.println("CustomerService constr");
	}
	public void save(){
		//saving to db
		System.out.println("saving Customer::");
	}
}
