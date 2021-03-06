package caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import basics.*;

public class TestGetEmployee1 {

public static void main(String[] args) {
SessionFactory sf = HibernateUtil.getSessionFactory();

System.out.println("*******SESSION1 OPNED********");
Session session = sf.openSession();
System.out.println("****call load method ****");
Employee emp = (Employee) session.load(Employee.class, 4);// from db
System.out.println(emp);

System.out.println("****call load method ****");
Employee emp1 = (Employee) session.load(Employee.class, 4);//from cache
System.out.println(emp1);
session.close();

System.out.println("*******SESSION2 OPNED********");
Session session1 = sf.openSession();
System.out.println("****call load method ****");
Employee emp3 = (Employee) session1.load(Employee.class, 4);//from db
System.out.println(emp3);

System.out.println("****call load method ****");
Employee emp4 = (Employee) session1.load(Employee.class, 4);//from cache
System.out.println(emp4);
session1.close();
}

}
