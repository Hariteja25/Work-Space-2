package hql;


/*
 
	 Req :   get employee by taking id as input
	 HQL :   from Employee where Id=inputid
	Employee emp = (Employee) query.uniqueResult();  -> fetches all columns
	
   
   //dont provide input ; provide using the place holders : use this appraoch to avoid sql injection
   Query query = sessionObj
				.createQuery(" from Employee where Id=:inputEmpId");
		query.setParameter("inputEmpId", id);
		
    
    //provide input directly to query   : Dont use this approach as this can lead to sql injection
		Query query1 = sessionObj
				.createQuery(" from Employee where Id="+id);
        
        
 */
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import basics.*;

public class TestHQL5 {
	public static void main(String[] args) {
		// get name for a given empid
		Session sessionObj = HibernateUtil.getSessionFactory().openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id::");
		int id = sc.nextInt();
		
		Query query = sessionObj
				.createQuery(" from Employee where id=:inputEmpId");
		query.setParameter("inputEmpId", id);
		
		// Query query1 = sessionObj.createQuery(" from Employee where id="+id);
		
		Employee emp = (Employee) query.uniqueResult();
		
		System.out.println(emp);
		sessionObj.close();
 
    }
}

