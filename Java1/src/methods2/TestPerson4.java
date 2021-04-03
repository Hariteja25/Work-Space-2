package methods2;

public class TestPerson4 {
	// write the print logic one time and reuse for all three objs
		// create obj & set data logic write for one time and reuse for all three objs
		public static void main(String[] args) {
			//1. create obj& set data
			Person p1 = getData(1000,"kumar", 23);
			System.out.println("*********print p1********************");
			//print data
			show(p1);
			
			Person p2 = getData(1001,"shyam", 25);
			//print data
			System.out.println("*********print p2********************");
			show(p2);
			
			
			Person p3=getData(1004,"ram", 29);
			//print data
			System.out.println("*********print p3********************");
			show(p3);
			
		}	

		public static void show(Person p) {// object as the input arg
			System.out.println(p.id);
			System.out.println(p.name);
			System.out.println(p.age);
		}
		
		// method returning the object
		public static Person getData(int id, String name, int age) {
			// create  obj
			Person p= new Person();

			//2.set the data
			p.id=id;
			p.name=name;
			p.age=age;

			return p;
		}

}
