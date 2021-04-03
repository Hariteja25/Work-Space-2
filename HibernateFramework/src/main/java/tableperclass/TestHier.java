package tableperclass;


import org.hibernate.Session;
import basics.*;
public class TestHier {

	public static void main(String[] args) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		
		Person1 p = new Person1();
		p.setAge(23);
		p.setUserName("per2");

		
		Employee1 emp = new Employee1();
		emp.setAge(24);
		emp.setUserName("emp2");
		emp.setProjId("pro123");
		emp.setDeptId("dept11");


		Student1 st = new Student1();
		st.setAge(25);
		st.setUserName("stu2");
		st.setBranchId("csc");
		st.setSemId("4");

		s.getTransaction().begin();
		s.save(emp);
		s.save(p);
		s.save(st);

		s.getTransaction().commit();
		s.close();

	}

}
  
