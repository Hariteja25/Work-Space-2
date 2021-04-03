package setcollections;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeController {
	String name;
	Set<Employee> emp;

	public EmployeeController(Set<Employee> emp,String name) {
		super();
		this.emp = emp;this.name=name;
	}
	
	public void process(){
	for(Employee e:emp) {
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.salary);
	}
	System.out.println(name);
	}
	
}
