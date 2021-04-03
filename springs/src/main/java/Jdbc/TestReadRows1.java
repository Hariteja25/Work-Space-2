package Jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestReadRows1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/jdbc/springs.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("empDao");

		 

		System.out.println("************print all emps using extractor**********");
		List<Employee> allEmps = dao.getAllEmployees1();
	 
		for (Employee e : allEmps) {
			System.out.println(e);
		}
	}
}