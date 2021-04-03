package criteria;
/*
 - How to perform Sorting/Ordering based on id,userName,usersalary?
 
solution:
-----------
  
  sort in ascening order:
  ----------------------------
  pass the instance variable names not the db column names
  empCriteria.addOrder(Order.asc("id")); -> sort based on id
  empCriteria.addOrder(Order.asc("userName")); -> sort based on userName
  empCriteria.addOrder(Order.asc("usersalary")); -> sort based on usersalary
 
 
 sort in descending order:
  ----------------------------
  pass the instance variable names not the db column names
  empCriteria.addOrder(Order.desc("id")); -> sort based on id
  empCriteria.addOrder(Order.desc("userName")); -> sort based on userName
  empCriteria.addOrder(Order.desc("usersalary")); -> sort based on usersalary
 
 */

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import basics.*;

 
public class TestCriteriaOrderBy1 {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Criteria empCriteria = session.createCriteria(Employee.class);
		
		empCriteria.addOrder(Order.asc("usersalary"));
		empCriteria.setMaxResults(20);
		List<Employee> employees = empCriteria.list();
		for(Employee e  : employees){
			System.out.println(e);
		}
		session.close();
	}
}
