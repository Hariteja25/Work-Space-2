package consumer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GetAllProducts1 {
	   public static void main(String[] args) {
		   AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		   IntegrationService service = applicationContext.getBean(IntegrationService.class);
	       String productList = service.getProductsJson();
	       System.out.println(productList);
	   }
}
