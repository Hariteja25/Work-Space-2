package manytomany;

import org.hibernate.Session;
import basics.*;
public class TestGetCources {
	
	public static void main(String[] args) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Student st = (Student) 
				s.load(Student.class, 1);// 1st query
		System.out.println(st);
		System.out.println(st.getCources());//2nd query
		s.close();
		 
	}
}  
   
   
   