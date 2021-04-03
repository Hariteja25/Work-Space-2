package constrObjMap;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmpController{

public static void main(String[] args) {
//get context obj
ApplicationContext context =new ClassPathXmlApplicationContext("file:src/main/java/constrObjMap/springs.xml");


EmployeeController ec = (EmployeeController)context.getBean("empc");
ec.process();


}
}