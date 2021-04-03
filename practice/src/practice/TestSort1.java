package practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSort1{


public static void main(String[] args) {
		//create a list
		List<Employee> empList = new ArrayList<Employee>();
	
    // add multiple emp objs
    empList.add(new Employee(10, "Murali", 25, 10000));
		empList.add(new Employee(50, "Arun", 29, 20000));
		empList.add(new Employee(6, "lakshman", 35, 5000));
		empList.add(new Employee(7, "lalith", 32, 50000));
    
    
    System.out.println("before :");
		show(empList);
    
    Collections.sort(empList);// every emp obj has compareTo() method
    //sort internally calls the compareTo() method for sorting the objects.
    
    System.out.println("\n\nsorting based on id:------");
		show(empList);
    
    
    
 } 
 
 private static void show(List<Employee> empList) {
		System.out.println("\n");
		for (Employee emp : empList) {
			System.out.println(emp);
		}
	}
  
  
}

