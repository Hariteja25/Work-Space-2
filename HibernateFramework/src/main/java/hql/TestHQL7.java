package hql;
/*
  Req :   get employee name  and salary  by taking id as input
    HQL :    select userName,usersalary from Employee where id=:inputId
    use uniqueResult()
    returnType of uniqueResult() : Object row[] array
                           row[0]  -> contain name
                           row[1] -> contain salary
 Return of uniqueResult:
   ---------------------------
   1 column (varchar)  -> String
   1 column (Number)  -> Integer/Long
   all columns    -> Employee obj 
>1 column but < all columns   -> Object array
   
   
    Return of list:
   ---------------------------
   1 column (varchar)  -> List<String>
   1 column (Number)  -> List<Integer>/List<Long>
   all columns    -> List<Employee? obj 
>1 column but < all columns   -> List<Object> array
                           
 */

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import basics.*;


public class TestHQL7 {
	public static void main(String[] args) { 
   // get session obj
		Session sOj = HibernateUtil.getSessionFactory().openSession();
		System.out.println("enter id::");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		
		// create query obj
		Query query = sOj
	    .createQuery("select userName,usersalary from Employee where id=:inputId ");
		query.setParameter("inputId", id);
		
		Object[] row = (Object[]) query.uniqueResult();
		
		String name = (String) row[0]; // userName
		Integer sal = (Integer) row[1]; // usersalary
		System.out.println(name);
		System.out.println(sal);
    }
}