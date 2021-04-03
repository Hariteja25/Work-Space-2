package issue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test2 {
	public static void main(String[] args) {
		 //1. get context object
	     ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/issue/springs.xml");
	    
	    	//2 using context obj pass bean id and get the bean obj
	     ProductService productService = (ProductService)  context.getBean("ps");
	    
	     ProductController productController = (ProductController)  context.getBean("pc");
	     ProductHelper productHelper = (ProductHelper)  context.getBean("ph");
	     ProductDAO productDAO = (ProductDAO)  context.getBean("pd");
	     
	    
			
	}

}
