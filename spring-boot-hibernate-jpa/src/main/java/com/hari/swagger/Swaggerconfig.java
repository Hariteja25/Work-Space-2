package com.hari.swagger;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swaggerconfig {
	
	
@Bean
public Docket dock() {
	//.paths(PathSelectors.ant("/api/*")).build();
	return new Docket(DocumentationType.SWAGGER_2).apiInfo(api()).select().apis(RequestHandlerSelectors.basePackage("com.hari")).build();
}


private ApiInfo api() {
	//return new ApiInfoBuilder().title("Hari").description("This is for vishnu").version("1.1").build();
	
	return new ApiInfo("Hari ", "This is for vishnu", "1.1", "http://localhost:8079","contact vishnu" , "8919062005", "Collections.emptyList()");
}




/*public Docket docket() {
	return new Docket(DocumentationType.SWAGGER_2)
			.select()
			.paths(PathSelectors.ant("/api/*"))
			.apis(RequestHandlerSelectors.basePackage("com.hari"))
			.build()
			.apiInfo(api());
			
}


private ApiInfo api() {
	
	return new ApiInfo(
			"Product Jpa Api", 
			"Sample project for jpa",
			"1.0",
			"Free to use",
			"Hariteja", 
			Collections.emptyList());
	
}
*/

}
