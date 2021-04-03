package Jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

    
  public class TestReadRowUsingMapper {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/jdbc/springs.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("empDao");

		System.out.println("enter id");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		Employee emp = dao.getEmpById2(id);
		if (emp == null) {
			System.out.println("emp not found");
		} else {
			System.out.println(emp);
		}

		 
	}
}
  