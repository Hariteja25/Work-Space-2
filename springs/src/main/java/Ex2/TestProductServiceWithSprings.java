package Ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestProductServiceWithSprings {
	public static void main(String[] args) {
  	Product product = new Product();
		product.setId("1234");
		product.setDesc("test desc");
		product.setBrand("lifestyle");
		product.setProductName("shirt merun");
    
    //spring will create obj , dev has to get obj from springs
   
   //get context obj
     ApplicationContext context = 	new ClassPathXmlApplicationContext("file:src/main/java/Ex2/springs.xml");
	
    
    //get ProductService from springs
    ProductService ps = (ProductService)context.getBean("pService");
    ps.save(product);
  
  }
  
}