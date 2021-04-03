package polymorphism;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p1=new Person1(1,"kumar",20,"nagar","hyd","tg","india",100);
		p1.display();
		
		Student s=new Student(2,"mahesh","kumar",1,"nagar1","pune","maha","india",
				101);
		s.display();
		
		Employee e=new Employee(3,"suresh","kumar",1922,18766,"nagar2","bnglr",
				"ka","india",102,"nagar3","hyd","tg","india",104,"nagar4","pune",
				"maha","india",105);
		e.display();
	
	

	}

}
