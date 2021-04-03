package hql;
/*
 /delete by name uisng HQL
hql : delete from Employee where userName=:myName
use executeUpdate(); [insert/update/delete]
read queries: list() or uniqueResults()

 */
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import basics.*;

//delete emp by name


public class TestHQL14 {

	public static void main(String[] args) {
		Session  sObj = HibernateUtil.getSessionFactory().openSession();
		String name ="testuser4";
		Transaction transaction = sObj.getTransaction();
		
		transaction.begin();
		Query  q = sObj.createQuery("delete from Employee where userName=:myName");
		q.setParameter("myName", name);
		int res = q.executeUpdate();
		transaction.commit();
		
		
		if(res >=1){
			System.out.println("delete succesful");
		}else{
			System.out.println("delete fail");
		}
	}
}