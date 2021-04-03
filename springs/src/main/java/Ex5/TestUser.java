package Ex5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestUser {

	public static void main(String[] args) {
		//get context obj
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/Ex5/springs.xml");
		
    //get UserService obj from springs
		UserService service = (UserService)	context.getBean("uService");
		service.saveUser();
    }
    
}