package oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import basics.*;
 

public class TestInsertEmp2 {

	public static void main(String[] data) {
  	//create session factory
		SessionFactory sf = 	HibernateUtil.getSessionFactory();
    
    	//create session obj
		Session s = sf.openSession();
    
    
   // create address obj with data
		AddressDetails add = new AddressDetails();
		add.setCity("Hyd");
		add.setCountry("IN");
		add.setPin(12345);
		add.setState("TS");
		add.setStreetNo("YUSAF GUDA");
    
      //save add obj
		s.getTransaction().begin();
		s.save(add);  //  1 row is inserted in address table
		s.getTransaction().commit();
    
   // create emp obj with data
		EmployeeWithAddress emp = new EmployeeWithAddress();
		emp.setAge(35);
		emp.setName("krishna kumar");


		// keep address obj inside emp
		emp.setCurAddress(add);
    
    //save employee obj
		s.getTransaction().begin();
		s.save(emp);  //1 row created in employee table 
		s.getTransaction().commit();
    
    s.close();
    
  
  }

}
 
  
   
   