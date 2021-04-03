package sql;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import basics.Employee;
import basics.HibernateUtil;

/**
HQL: uses instance varibales and class name, use createQuery() method.
SQL : uses column names and tabke names, use createSQLQuery() method.

  Req: get all employee
  sql: SELECT * FROM EMPLOYEEDETAILS
  as this retuns multiple rows, use list() method
 */
public class Test1 {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		String sql = "SELECT * FROM EMPLOYEEDETAILS";
		List<Object[]>list = session.createNativeQuery(sql).list();
for (Object[] objects : list) {
            
            System.out.println(objects[0]  + "-" + objects[1]);
         }
		session.close();
	}
}
