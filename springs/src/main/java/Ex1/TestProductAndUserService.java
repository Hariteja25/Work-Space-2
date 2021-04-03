package Ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestProductAndUserService {

	public static void main(String[] args) {
	
  //get context obj
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/Ex1/springs.xml");
		
    //2. Get ProductService obj
    ProductService ps = (ProductService)context.getBean("pService");
    
    //3. Get UserService obj
		UserService us = (UserService)context.getBean("userServiceObj");
    
       ps.getAllProducts();
       us.process();
    
    
  }
  
}
