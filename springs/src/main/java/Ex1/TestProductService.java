package Ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestProductService {

	public static void main(String[] args) {
		
     //1. get context object
     ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/Ex1/springs.xml");
    
    	//2 using context obj pass bean id and get the bean obj
     ProductService productService = (ProductService)  context.getBean("pService");
 productService.getAllProducts();
     
     
		ProductService ps1 = (ProductService)context.getBean("pService");
		ps1.getAllProducts();
    // only one obj is returned even though getBean("pService") is called two times

    if(productService==ps1){
    System.out.println("same obj ");
    }else{
    System.out.println("diff same");
    }
    }
}
