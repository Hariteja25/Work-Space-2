package basics;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestBulkInsertEmployee {
	public static void main(String[] args) {
  
   // create sf obj
		SessionFactory sf = HibernateUtil.getSessionFactory();

		// crate session obj
		Session sessionObj = sf.openSession();

		// create transaction obj
		Transaction transaction = sessionObj.getTransaction();
    
    transaction.begin();
  try {
			for (int i = 1; i <= 5000; i++) {
			 
				String name = "testuser" + i;
				int sal = 5000 + i;
				Employee empObj = new Employee();
				empObj.setUserName(name);
				empObj.setUsersalary(sal);
				 
         // save the entity obj in table
				sessionObj.save(empObj);

			 
				if (i % 100 == 0) {
					sessionObj.flush();
					sessionObj.clear();
				}
			}
      
      
			transaction.commit();
			System.out.println("data saved");
		} catch (HibernateException e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}
  
  
  }
}
  