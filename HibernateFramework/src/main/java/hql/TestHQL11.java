package hql;
//get emp names whose salary >5000
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import basics.*;
   
public class TestHQL11 {
	public static void main(String[] args) {
   Session sessionObj = HibernateUtil.getSessionFactory().openSession();
		Query query = sessionObj.createQuery("select userName from Employee where usersalary>5000");
		List<String> names = query.list();
		for (String name : names) {
			System.out.println(name);
		}
		sessionObj.close();
  
  }
}
  
  