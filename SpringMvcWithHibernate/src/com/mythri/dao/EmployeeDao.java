package com.mythri.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mythri.dto.Employee;
import com.mythri.dto.EmployeeListResponse;

@Repository("empDao")
public class EmployeeDao {
	
	static int resultsPerPage;
	static Properties props;

	static {
		String resourceName = "config.properties"; // could also be a constant
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		props = new Properties();
		try (InputStream resourceStream = loader.getResourceAsStream(resourceName)) {
			props.load(resourceStream);
		} catch (IOException e) {

		}
		resultsPerPage = Integer.parseInt((String) props.get("pageSize"));
	}

	@Autowired
	private SessionFactory sessionFactory;

	public void saveEmployee(final Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		session.save(employee);// 1 row in emp table
		transaction.commit();
		session.close();
	}

	public boolean isEmployeeExists(String login_name) {
		Session session = sessionFactory.openSession();
		Query q = session.createQuery("select count(*) from Employee  where loginname=:inputName");
		q.setParameter("inputName", login_name);
		long count = (Long) q.uniqueResult();
		session.close();
		return count >= 1 ? true : false;
	}

	public Employee getValidEmpByAuth(Employee employee) {
		Session session = sessionFactory.openSession();
		Query q = session.createQuery("from Employee e where e.loginName=:eName and e.password=:ePass");
		q.setParameter("eName", employee.getLoginName());
		q.setParameter("ePass", employee.getPassword());
		Employee validEmp = (Employee) q.uniqueResult();
		session.close();
		return validEmp;
	}

	public Employee searchByName(String name) {
		Session session = sessionFactory.openSession();
		Query q = session.createQuery("from Employee e where loginName=:name");
		q.setParameter("name", name);
		Employee validEmp = (Employee) q.uniqueResult();
		session.close();
		return validEmp;
	}
	
	
	

	

	public List<Employee> getAllEmployees(Integer id) {
		Session session = sessionFactory.openSession();
       Query query = session.createQuery("from Employee Where id!=:id");
		query.setParameter("id", id);
		List<Employee> list = (List<Employee>) query.list();
		session.close();
		return list;
	}
	
	public List<Employee> getAllEmployees1() {
		Session session = sessionFactory.openSession();
		Criteria c = session.createCriteria(Employee.class);
		List<Employee> list = (List<Employee>)c.list();
		session.close();
		return list;
		}
	
	
	
	
	public Employee getEmpById(int id) {
		Session session = sessionFactory.openSession();
		Query q = session.createQuery("from Employee e where id=:id");
		q.setParameter("id", id);
		Employee validEmp = (Employee) q.uniqueResult();
		session.close();
		return validEmp;
	}

	public boolean deleteEmployee(final Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		session.delete(employee);
		transaction.commit();
		session.close();
		return true;
	}

	public void updateEmployee(final Employee newEmpDetails) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();

		// get current data
		Employee empFromDB = getEmpById(newEmpDetails.getId());

		// update with new data
		copyEmp(newEmpDetails, empFromDB);

		session.merge(empFromDB);
		transaction.commit();
		session.close();
	}

	private void copyEmp(Employee source, Employee target) {
		if (StringUtils.isNotEmpty(source.getName())) {
			target.setName(source.getName());
		}
		if (StringUtils.isNotEmpty(source.getlName())) {
			target.setlName(source.getlName());
		}
		if (StringUtils.isNotEmpty(source.getEmail())) {
			target.setEmail(source.getEmail());
		}
		target.setAge(source.getAge());
		target.setSalary(source.getSalary());
	}

	public EmployeeListResponse listEmployeess(int pageId) {
		Session sf = sessionFactory.openSession();
		Query query2 = sf.createQuery("select count(*) from Employee");
		long count = (Long) query2.uniqueResult();//to find the Total number of rows in the database

		

		// set the pagization properties:
		
		int fr = (pageId - 1) * resultsPerPage;//to identify the starting row number based on pagesize
		long noOfPages = count % resultsPerPage == 0 ? count / resultsPerPage : (count / resultsPerPage) + 1;
		
		Query query = sf.createQuery("from Employee");
		
		query.setFirstResult(fr);
		query.setMaxResults(resultsPerPage);

		List<Employee> list = (List<Employee>) query.list();
		sf.close();

		return new EmployeeListResponse(list, noOfPages);
	}

	
//---------------------------------------------------------------------------------------------------------------------------------------
	
	public Employee getValidemp(String pass1, Integer id) {
		Session session = sessionFactory.openSession();
		Query q = session.createQuery("from Employee e where e.password=:inputpassword and e.id=:id");
		q.setParameter("inputpassword", pass1);
		q.setParameter("id", id);
		Employee validEmp = (Employee) q.uniqueResult();
		session.close();
		return validEmp;
	}
	

	
	
	public int updatepswd(String pass2 ,Integer id) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();

		
		  Query q = session.createQuery("UPDATE Employee e SET e.password=:inputpassword WHERE e.id=:inputid");
		  q.setParameter("inputpassword", pass2); 
		  q.setParameter("inputid", id);
		  int validEmp = (int) q.executeUpdate();
		  transaction.commit();
		  session.close();
		  return validEmp;
	}
	
//----------------------------------------------------------------------------------------------------------------------------------
	
	public void updateMyEmployee( Employee emp,Integer id) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
       
		 Query q = session.createQuery("UPDATE Employee e SET e.name=:inputname,e.lName=:inputlname,e.age=:inputAge,"
		 		+ "e.salary=:inputSalary,e.email=:inputemail WHERE e.id=:inputid");
		  q.setParameter("inputname", emp.getName()); 
		  q.setParameter("inputlname", emp.getlName()); 
		  q.setParameter("inputAge", emp.getAge()); 
		  q.setParameter("inputSalary", emp.getSalary()); 
		  q.setParameter("inputemail", emp.getEmail()); 
		  q.setParameter("inputid", id);
		  q.executeUpdate();
		transaction.commit();
		session.close();
	}
}
