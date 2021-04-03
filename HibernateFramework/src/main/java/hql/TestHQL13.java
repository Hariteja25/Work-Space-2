package hql;
//get employee name who has min salary
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import basics.*;
 
public class TestHQL13 {
	public static void main(String[] args) {
 Session sessionObj = HibernateUtil.getSessionFactory().openSession();
		Query query = sessionObj.createQuery("select userName from Employee where usersalary= (select MIN(usersalary) from Employee)");
		String name = (String) query.uniqueResult();
		
			System.out.println(name);
		
		sessionObj.close();

}
}
