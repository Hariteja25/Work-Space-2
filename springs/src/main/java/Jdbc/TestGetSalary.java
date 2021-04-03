package Jdbc;




import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestGetSalary {
	public static void main(String[] args) {
  
  
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"file:src/main/java/jdbc/springs.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("empDao");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter  id to get salary");
		int id = sc.nextInt();
		
		float status = dao.getSalary(id);
		if (status == 0) {
			System.out.println("getSalary fail");
		} else {
			System.out.println("getSalary success");
		}
		System.out.println("rows got:==" + status);
	
  
  }
  
  
  }
