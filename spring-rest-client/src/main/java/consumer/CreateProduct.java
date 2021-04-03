package consumer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CreateProduct {
public static void main(String[] args) {
AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
IntegrationService service = applicationContext.getBean(IntegrationService.class);

//create product obj
Product product = new Product();
product.setArticleId(6000);
product.setTitle("3abc");
product.setCategory("cameara11");

String status = service.createProduct(product);

System.out.println(status);

}
}