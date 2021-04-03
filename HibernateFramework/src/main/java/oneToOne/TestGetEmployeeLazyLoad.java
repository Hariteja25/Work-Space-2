package oneToOne;
import org.hibernate.Session;

import basics.*;
public class TestGetEmployeeLazyLoad {
	
	public static void main(String[] args) {
		
		Session s = HibernateUtil.getSessionFactory().openSession();
		EmployeeWithAddress emp = (EmployeeWithAddress) 
				s.load(EmployeeWithAddress.class, 1);// 1st query
		System.out.println(emp);
		s.close();
		
		System.out.println(emp);
		System.out.println(emp.getCurAddress());
	}
}