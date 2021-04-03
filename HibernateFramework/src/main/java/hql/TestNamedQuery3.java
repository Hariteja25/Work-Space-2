package hql;
/*
Req:
get employee names
*/
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import basics.*;

public class TestNamedQuery3 {

public static void main(String[] args) {
Session s = HibernateUtil.getSessionFactory().openSession();
//Query listQuery = s.createQuery("select userName from Employee"); //using hql
Query listQuery = s.getNamedQuery("getEmpNames"); //using named query


List<String> names = listQuery.list();
for (String name: names) {
System.out.println(name);
}
}
}  
  

