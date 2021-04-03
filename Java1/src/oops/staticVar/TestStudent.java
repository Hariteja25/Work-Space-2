package oops.staticVar;

public class TestStudent {
public static void main(String[] args) {
		
		// access static variables using class name
		Student.colleageName = "REVA enggg colleg";
		
		// access instance varible using object
		Student s = new Student();
		s.id=1200;
		
		
		//print
		System.out.println(Student.colleageName);
		System.out.println(s.id);
	}

}
