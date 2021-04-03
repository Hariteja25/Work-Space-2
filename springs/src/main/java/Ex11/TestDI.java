package Ex11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {

	public static void main(String[] args) {
    //get  context obj
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/Ex11/springs.xml");
		
    //get UserService obj from springs
    UserService service = (UserService) context.getBean("uService");
		service.saveUser();
	}
}


