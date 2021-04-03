package Annotations.resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "myAppUtil")
public class ApplicationUtil {
 
    public void save(){
    	System.out.println("applicationUtil save : ");
    }
    
}