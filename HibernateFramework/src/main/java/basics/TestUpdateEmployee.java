package basics;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import java.util.Scanner;

public class TestUpdateEmployee {
	public static void main(String[] args) {
  
  SessionFactory sessionFactory =new Configuration().configure().buildSessionFactory();
  Session session = sessionFactory.openSession();
  
  // 3.read inputs
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name::");
		String name = sc.next();

		System.out.println("Enter sal::");
		int sal = sc.nextInt();

		// create emp obj
		System.out.println("enter id");
		int id = sc.nextInt();

	Employee emp = new Employee();
  emp.setId(id);
  emp.setUserName(name);
  emp.setUsersalary(sal);
  
  
  	// perform update operation
		session.getTransaction().begin();
  session.update(emp); 
session.getTransaction().commit();
		session.close();
  }
  
  }