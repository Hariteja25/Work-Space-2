package oneToOne;

import org.hibernate.Session;
import basics.*;
public class TestGetEmployee {
	
	public static void main(String[] args) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		EmployeeWithAddress emp = (EmployeeWithAddress) 
				s.load(EmployeeWithAddress.class, 4);// 1st query
		System.out.println(emp);
		System.out.println(emp.getCurAddress());//2nd query
		s.close();
		 
	}
}  
   
   
   