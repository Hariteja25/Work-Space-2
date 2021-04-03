package criteria;
/*
 import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.dao.Employee;
import com.dao.HibernateUtil;

public class AllCriteria {
	public static void main(String[] args) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Criteria empCriteria = s.createCriteria(Employee.class);

		//order by salaryinfo
		empCriteria.addOrder(Order.asc("usersalary"));

		//name = 'krishna'
		empCriteria.add(Restrictions.eq("userName", "krishna"));

		// name like '%kumar%'
		empCriteria.add(Restrictions.like("userName", "%kumar%"));

		// salaryInfo between (5000, 10000)
		empCriteria.add(Restrictions.between("usersalary", 5000, 10000));

		// name = 'krishna' or name is null
		empCriteria.add(Restrictions.eqOrIsNull("userName", "krishna"));

		// Id = 2000
		empCriteria.add(Restrictions.idEq("2000"));

		// name = 'krishna' or name = 'ram' or name = 'ramesh'
		empCriteria.add(Restrictions.in("userName", 
				Arrays.asList("krishna", "ram", "ramesh")));
		
		//name = ''
		empCriteria.add(Restrictions.isEmpty("userName"));
		
		//name != ''
		empCriteria.add(Restrictions.isNotEmpty("userName"));

		// name is NULL
		empCriteria.add(Restrictions.isNull("userName"));
		
		//name is NOT NULL
		empCriteria.add(Restrictions.isNotNull("userName"));
		
		//salaryInfo > 10000
		empCriteria.add(Restrictions.gt("usersalary", 10000));
		
		//salaryInfo >= 10000
		empCriteria.add(Restrictions.ge("usersalary", 10000));
		
		//salaryInfo < 10000
		empCriteria.add(Restrictions.lt("usersalary", 10000));
		
		//salaryInfo <= 10000
		empCriteria.add(Restrictions.le("usersalary", 10000));
		
		
		empCriteria.add(Restrictions.neProperty(propertyName, otherPropertyName)
				 
	    
		List<Employee> list = empCriteria.list();
		System.out.println(list.size());
		for (Employee e : list) {
			System.out.println(e);
		}
		s.close();
	}
}
 */
/*
Req:
search employees 


search by:
--------------------------------------------------------------
exact username [empCriteria.add(Restrictions.eq("userName", name));]
similar username  [empCriteria.add(Restrictions.like("userName", "%"+userNameLike+"%")); ]
salary between minsal and  maxsal  [ empCriteria.add(Restrictions.between("usersalary", minSal, maxSal)); ]


orderby:    [empCriteria.addOrder(Order.asc("<orderby here>"));]
-------------------------------------------------------
id      
username
usersalary

*/	
  
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;


import basics.*;

public class TestCriteriaAllEmps {
	//orderby ,username, minsal, max sal are optional
	public static void main(String[] args) {
	  //inputs
		
		String name="kumar"; //exact name
		String userNameLike=""; // similar name
		String salOrderBy = "desc"; //order by asc or desc
		int minSal=0; //min sal
		int maxSal=0;//max sal
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Criteria empCriteria = session.createCriteria(Employee.class);

		if(name!=null  && !name.equals("") ){
			empCriteria.add(Restrictions.eq("userName", name));
		}
		
		
		if(userNameLike!=null  && !userNameLike.equals("") ){
			empCriteria.add(Restrictions.like("userName", "%"+userNameLike+"%"));
		}

		
		if("asc".equals(salOrderBy) ){
			empCriteria.addOrder(Order.asc("usersalary"));
		}else if("desc".equals(salOrderBy) ){
			empCriteria.addOrder(Order.desc("usersalary"));
		}

		
		if (minSal != 0 && maxSal!=0) {
			empCriteria.add(Restrictions.between("usersalary", minSal, maxSal));
		}
		
		List<Employee> employees = empCriteria.list();

		for(Employee e  : employees){
			System.out.println(e);
		}
		System.out.println(employees.size());
		session.close();
	}
}