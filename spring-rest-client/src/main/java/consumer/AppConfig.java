package consumer;

import java.util.Collections;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig { 
	
	@Bean
	RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		
		MappingJacksonHttpMessageConverter converter = new MappingJacksonHttpMessageConverter();
		//converter.setObjectMapper(new ObjectMapper());
		converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
		
		restTemplate.getMessageConverters().add(converter);
		return restTemplate;
	}
	
	@Bean
	IntegrationService integrationService() {
		return new IntegrationService();
	}
}

      