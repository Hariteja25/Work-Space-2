package Annotations.resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "service2")
@Scope(value = "prototype")
public class Service2 {

public void save(){
System.out.println("applicationUtil save : ");
}

}