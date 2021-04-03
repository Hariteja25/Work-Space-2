package onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import basics.*;

public class TestOneToMany {

	public static void main(String[] args) {
	 	Session s = HibernateUtil.getSessionFactory().openSession();
		s.getTransaction().begin();
    
    //create cust obj
    Customer cust1 = new Customer("John", 25);
    
    //creae acc objs 
    Accounts a1 = new Accounts("savings", "John savings desc", cust1);
		Accounts a2 = new Accounts("current", "John vcurrent desc", cust1);
		Accounts a3 = new Accounts("loan", "John loan desc", cust1);
    
    //add accounts to list
		List<Accounts> accounts = new ArrayList<>();
		accounts.add(a1);
		accounts.add(a2);
		accounts.add(a3);
    
    //add list to customer obj
    cust1.setAccounts(accounts);
    
    //save cust obj
    s.save(cust1);    // 1 row is inserted in customer table and 3 rows are inserted in accounts table.

    //commit
    s.getTransaction().commit();
		s.close();
	}
  
  }