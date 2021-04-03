package hql;
//get salary based on name
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import basics.*;



public class TestHQL10 {
	public static void main(String[] args) { 
  // get name for a given empid
		Session sessionObj = HibernateUtil.getSessionFactory().openSession();
		System.out.println("enter userName::");
		Scanner sc = new Scanner(System.in);
		String userName = sc.next();
		
		Query query = sessionObj
				.createQuery("select usersalary from Employee where userName=:inputEmpUserName");
		query.setParameter("inputEmpUserName", userName);
		Integer usersalary = (Integer)query.uniqueResult();
		System.out.println(usersalary);
		sessionObj.close();
    }
}
