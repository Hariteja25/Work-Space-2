package oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import basics.*;


public class TestInsertEmp1 {

	public static void main(String[] args) {
		
	
 	//create session factory
		SessionFactory sf = 	HibernateUtil.getSessionFactory();
   
   	//create session obj
		Session s = sf.openSession();
   
   
   // create address obj with data
		AddressDetails add = new AddressDetails();
		add.setCity("Hyd");
		add.setCountry("INDIA");
		add.setPin(123456);
		add.setState("TS1");
		add.setStreetNo("YUSAF GUDA12");
   
   
   // create emp obj with data
		EmployeeWithAddress emp = new EmployeeWithAddress();
		emp.setAge(34);
		emp.setName("krishna kumar12");


		// keep address obj inside emp
		emp.setCurAddress(add);
   
   //save employee obj
		s.getTransaction().begin();
		s.save(emp);  //1 row created in employee table  + 1 row is inserted in address table
		s.getTransaction().commit();
   
   s.close();
   
 
 }

}
  