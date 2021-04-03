package basics;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestDeleteEmployee {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		// create emp obj
		String name = "testuser10";
		int id = 10;
		Employee emp = new Employee();
		emp.setId(id);
		emp.setUserName(name);
		
		//perform delete operation
		session.getTransaction().begin();
		session.delete(emp);// delete the row based on id
		session.getTransaction().commit();
		session.close();
	}
}






