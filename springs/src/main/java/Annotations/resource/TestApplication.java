package Annotations.resource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class TestApplication {
	public static void main(String args[]) {
		//get context obj
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		//approach1 get bean obj for Application 
		Application application = (Application) context.getBean("myApp");
		
		//approach2 get bean obj for Application
		Application application1 = (Application) context.getBean(Application.class);
		
		application.process();
	}
}