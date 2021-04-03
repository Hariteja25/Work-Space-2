package Ex6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestUserProduct {

	public static void main(String[] args) {
     //create context obj
		ApplicationContext context = 	new ClassPathXmlApplicationContext ("file:src/main/java/Ex6/springs.xml");
    
    	//get UserService obj
		UserService uService = (UserService)context.getBean("uService");
		
		//get ProductService obj
		ProductService pService = (ProductService)context.getBean("pService");
		
	  uService.saveUser();
		pService.saveProduct();
  
  }
  
  
}


