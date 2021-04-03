package hql;
/*
 Req :   get all employee salaries from EmployeeDetails table
 HQL :select usersalary from Employee
 use q.list()    
  
 */

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import basics.*;
public class TestHQL3 {
	public static void main(String[] args) {
   Session sessionObj = HibernateUtil.getSessionFactory().openSession();
		// get all names from employeee
		Query query = sessionObj.createQuery("select usersalary from Employee");
		List<Integer> salaries = query.list();
		for (Integer salary : salaries) {
			System.out.println(salary);
		}
		sessionObj.close();
   
   }
}
 
 
   
 
 