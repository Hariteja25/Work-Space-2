package Ex3;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestUserService {

	public static void main(String[] args) {
		
    // get input from console
		System.out.println("enter user detials::");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter name");
		String name = sc.next();

		System.out.println("enter mobile");
		String mobile = sc.next();

		System.out.println("enter gender");
		String gender = sc.next();

		// keep input data in user obje
		User user = new User(name, mobile, gender);

// get context obj
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/Ex3/springs.xml");

		// get user service obj with the help of context obj
		UserService us = (UserService) context.getBean("userServiceObj");
    
    // save obj data
		us.saveUser(user);
    
    }
    
  }
