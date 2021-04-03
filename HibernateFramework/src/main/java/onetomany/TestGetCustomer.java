package onetomany;

import org.hibernate.Session;
import basics.*;
public class TestGetCustomer {
	
	public static void main(String[] args) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Accounts a = (Accounts) 
				s.load(Accounts.class, 2);// 1st query
		System.out.println(a);
		System.out.println(a.getCustomer());//2nd query
		s.close();
		 
	}
}  
   
   
   