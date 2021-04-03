package criteria;

/**
Get all the employees

*/


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import basics.*;


public class TestCriteria1{

	public static void main(String[] args) {
 //get session obj
		Session  s = HibernateUtil.getSessionFactory().openSession();
   
   //get criteria obj
   Criteria c1 = s.createCriteria(Employee.class);
		
	
 //call list method
 	List<Employee> list = c1.list();
	  for(Employee e: list){
			System.out.println(e);
		}
   
   //close session
		s.close();	
   
 


}

}   		