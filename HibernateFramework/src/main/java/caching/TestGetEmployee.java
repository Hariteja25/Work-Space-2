package caching;
/*
 1.Level-1  (session obj level)
--------------------------------------

1.1st call will happend to cache
2.if not found then only calls the db

within the session if we try to call the db with the same query multiple times
then only 1st time call will hit the db
from second call it will fetch from cache
after session is closed , then cache is cleared.

ex:

1.open session
2.call load method to fetch emloyee whose id is 1   -> hit db
3.call load method t0 fetch emloyee whose id is 1   -> will not hit db , fetches cache
4.close session
 // cache is closed
 
5.open session
6.call load method to fetch emloyee whose id is 1   -> hit db
7.call load method t0 fetch emloyee whose id is 1  -> will not hit db , fetches cache
8.close session
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import basics.*;

public class TestGetEmployee {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		Session session = sf.openSession();
		
		System.out.println("*******SESSION1 OPNED********");

		System.out.println("****call load method ****");
		Employee emp = (Employee) session.load(Employee.class, 5);
		System.out.println(emp);

		System.out.println("****call load method ****");
		Employee emp1 = (Employee) session.load(Employee.class, 5);
		System.out.println(emp1);

		
		session.close();

}
	
}
