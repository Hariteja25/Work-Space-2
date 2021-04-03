package reflections;
/*
 How to get class Information using the object?
 
 ex:
 Person p = new Person();
 Class c=p.getClass(); 
 */

public class Ex2 {
	public static void main(String args[]) throws ClassNotFoundException {
		Person p = new Person();
		Student s = new Student();
		
		System.out.println("*********Print person class info******************");
		 Class c=p.getClass(); // to fetch person class info    
		 System.out.println("class name = "+c.getName());  
		 
		 
		 System.out.println("*********Print Student class info******************");
		 Class c1=s.getClass();  // to fetch Student class info  
		 System.out.println("class name = "+c1.getName()); 
		 System.out.println("parent class name = "+c1.getSuperclass().getName()); //to fetch the parent class for Student
		 
	}
}