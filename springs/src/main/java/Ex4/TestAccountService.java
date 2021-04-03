package Ex4;

//get context obj
//get AccountService from springs

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestAccountService {

	public static void main(String[] args) {
// get context obj
ApplicationContext context = 
				new ClassPathXmlApplicationContext
				("file:src/main/java/Ex4/springs.xml");
   
   // get AccountService from springs
 AccountService acc = (AccountService) context.getBean("aService");
   acc.connect();
 acc.save();
	}
}