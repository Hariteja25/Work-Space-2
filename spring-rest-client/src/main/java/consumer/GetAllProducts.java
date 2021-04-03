package consumer;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GetAllProducts {
public static void main(String[] args) {
AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
IntegrationService service = applicationContext.getBean(IntegrationService.class);
List<Product> products = service.getProductList();
for(Product product : products) {
System.out.println("**********************************************");
System.out.println(product.getArticleId());
System.out.println(product.getCategory());
System.out.println(product.getTitle());

}

}
}

