package tableperhier;

import org.hibernate.Session;
import basics.*;
public class TestHier {

	public static void main(String[] args) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		
		Person p = new Person();
		p.setAge(23);
		p.setUserName("per2");


		EmployeeDetails emp = new EmployeeDetails();
		emp.setAge(24);
		emp.setUserName("emp2");
		emp.setProjId("pro123");
		emp.setDeptId("dept11");

		
		Student st = new Student();
		st.setAge(25);
		st.setUserName("stu2");
		st.setBranchId("csc");
		st.setSemId("4");

		s.getTransaction().begin();
		
		s.save(p);
		s.save(emp);
		s.save(st);

		s.getTransaction().commit();
		s.close();

	}

}
