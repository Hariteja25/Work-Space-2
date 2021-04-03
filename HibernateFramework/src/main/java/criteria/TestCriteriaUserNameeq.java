package criteria;

/**
get employee whose name is murali


steps:
1.create criteria obj
Criteria empCriteria = s.createCriteria(Employee.class);

2. add restriction using  eq method
	  empCriteria.add(Restrictions.eq("userName", "ram"));

*/


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import basics.*;
public class TestCriteriaUserNameeq {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		Criteria empCriteria = session.createCriteria(Employee.class);

		empCriteria.add(Restrictions.eq("userName", "ram"));
		// select * from EmployeeDetails where userName ='murali'
		
		List<Employee> employees = empCriteria.list();
		for(Employee e  : employees){
			System.out.println(e);
		}
		session.close();
	}
}
