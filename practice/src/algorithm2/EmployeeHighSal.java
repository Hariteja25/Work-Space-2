package algorithm2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	String empName;
	int empSal;
	public Employee(String empName, int empSal) {
		this.empName = empName;
		this.empSal = empSal;
	}
	
	public String getEmpName() {
		return empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empSal=" + empSal + "]";
	}

	@Override
	public int compareTo( Employee emp) {
		
		return (int)(this.empSal-emp. getEmpSal());
	}


	
}

public class EmployeeHighSal {

	public static void main(String[] args) {

		Employee emp1 = new Employee("Ram", 62000);
		Employee emp2 = new Employee("Raj", 48000);
		Employee emp3 = new Employee("Ravi", 52000);
		Employee emp4 = new Employee("Somu", 46000);
		Employee emp5 = new Employee("krishna", 50000);
		Employee emp6 = new Employee("Balram", 38000);
		Employee emp7 = new Employee("Laxman", 46000);
		Employee emp8 = new Employee("Bharath", 51000);

		ArrayList<Employee> emplist = new ArrayList<>();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3); 
		emplist.add(emp4);
		emplist.add(emp5);
		emplist.add(emp6);
		emplist.add(emp7);
		emplist.add(emp8);
		System.out.println(":::::::: All Employee's List ::::::::  \n");
		emplist.forEach(data->System.out.println(data));
		System.out.println("------------------------------------------------------");
		Comparator<Employee> c=(e1,e2)->(int)(e2.getEmpSal()-e1.getEmpSal());
		Collections.sort(emplist,c);
		
		//Collections.sort(emplist);
		emplist.forEach(data->System.out.println(data));
		
	}

}
