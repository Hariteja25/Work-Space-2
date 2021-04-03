package basics;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestInsertVisitor {
	public static void main(String[] args) {
  
     // 1.create sf obj
		SessionFactory sf =new Configuration().configure().buildSessionFactory();
    
    // 2.crate session obj
		Session sessionObj = sf.openSession();
    
    //3.create entity obj with data
    Visitor visObj = new Visitor();
   visObj.setMyId(12);
		visObj.setMyName("mahesh");
    
    //4.open txn  [create transaction obj ]
    Transaction transaction = sessionObj.getTransaction();
		transaction.begin();
    
    //5.call session.save()
    sessionObj.save(visObj);
    
    //6.commit transaction
    transaction.commit();
   
   //6.close session
		System.out.println("data saved");
		sessionObj.close();
    
  }
  
}

 