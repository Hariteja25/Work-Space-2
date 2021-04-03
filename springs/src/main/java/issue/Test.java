package issue;

public class Test {

	public static void main(String[] args) {
		ProductController pc = new ProductController();
    
    //create service obj
		ProductService service = new ProductService();
		
    //keep service obj inside controller obj
		pc.service=service;
				
    
    
    //create helper obj
		ProductHelper helper = new ProductHelper();
	
  //keep helper inside product service
		service.helper = helper;
		
 //create dao obj
		ProductDAO daoObj = new ProductDAO();
	
  //keep dao inside helper
		helper.dao= daoObj;    
    
    
    
		pc.process();
			
        
        
    
    }
}