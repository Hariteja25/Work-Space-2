package hql;
/*
 
	 Req :   get employee by id = 60 
	 HQL :   from Employee where Id=60
	   use query.uniqueResult()
	 */
 

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import basics.*;

public class TestHQL4 {
	public static void main(String[] args) {
		

   // get employee by id = 60 
		Session sessionObj = HibernateUtil.getSessionFactory().openSession();
		Query query = sessionObj
				.createQuery(" from Employee where id=50");
		Employee emp = (Employee) query.uniqueResult();
		System.out.println(emp);
    }
}