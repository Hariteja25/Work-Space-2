package issue;

public class ProductController {

	ProductService service;
	
  public void process(){
		System.out.println("entering ProductController.proces method");
		service.validate();
		System.out.println("exit ProductController.proces method");
	}
	 
   
  }
  