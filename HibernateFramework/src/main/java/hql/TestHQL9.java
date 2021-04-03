package hql;
//get salary based on id
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import basics.*;



public class TestHQL9 {
	public static void main(String[] args) { 
 
		Session sessionObj = HibernateUtil.getSessionFactory().openSession();
		System.out.println("enter id::");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		
		Query query = sessionObj
				.createQuery("select usersalary from Employee where id=:inputEmpId");
		query.setParameter("inputEmpId", id);
		Integer usersalary = (Integer)query.uniqueResult();
		System.out.println(usersalary);
		sessionObj.close();
    }
}
