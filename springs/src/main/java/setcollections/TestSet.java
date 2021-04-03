package setcollections;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSet {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/setcollections/springs.xml");
		EmployeeController e =(EmployeeController)context.getBean("empc");
		e.process();
		
	}
}