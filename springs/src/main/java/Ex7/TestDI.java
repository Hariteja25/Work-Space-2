package Ex7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext
				("file:src/main/java/Ex7/springs.xml");
		UserService uService =(UserService)context.getBean("uService");
    	System.out.println(uService.getUserName());
    	System.out.println(uService.getEnvs());
    	System.out.println(uService.getNum());
	}
}