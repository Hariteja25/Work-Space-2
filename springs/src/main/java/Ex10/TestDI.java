package Ex10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestDI {

	public static void main(String[] args) {
  	// get context obj
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/Ex10/springs.xml");
    
    	// get UserService from springs
		UserService service = (UserService) context.getBean("uService");
   service.process();
   
   
   // get AccountService from springs
		AccountService acc = (AccountService) context.getBean("aService");
    acc.connect();
		acc.save();

  }
  
  
 } 


