package caching;

import org.hibernate.Session;
import basics.*;
public class TestHibStates2 {

	public static void main(String[] args) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		
		Employee e = new Employee();//Transiant state
		e.setUserName("krishnakumar1238");
		e.setUsersalary(11111);
		
		s.getTransaction().begin();
		s.save(e);	//state changes to persistence state. triggers insert query
		s.getTransaction().commit();  
		
		s.close();//state changes to detached
		
		//transcations on the detached obj
		Session s1 = HibernateUtil.getSessionFactory().openSession();
		e.setUserName("krishna9898");
		
		s1.getTransaction().begin();
		s1.merge(e);//state will Change to persistence
		s1.getTransaction().commit();
		
		s1.close();//state changes to detached
	}
}
