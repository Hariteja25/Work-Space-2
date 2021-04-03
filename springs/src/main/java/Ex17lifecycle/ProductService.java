package Ex17lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ProductService implements InitializingBean, DisposableBean {
	String name;

	public ProductService(String name) {
		System.out.println("Param constr called");
		this.name = name;
	}
	public ProductService(){
		System.out.println("prodservice constr");
	}
	public void save(){
		//saving to db
		System.out.println("saving  Product::"+name);
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Call destroy method");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("call Properities set");
		
	}
}
