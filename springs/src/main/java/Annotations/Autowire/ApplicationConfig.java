package Annotations.Autowire;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value={"annotations.autowire"})
public class ApplicationConfig {
 
}