package constr;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmpController{

public static void main(String[] args) {
//get context obj
ApplicationContext context =new ClassPathXmlApplicationContext("file:src/main/java/constr/springs.xml");


EmployeeController ec = (EmployeeController)context.getBean("Controller");
ec.process();


}
}


