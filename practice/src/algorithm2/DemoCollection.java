package algorithm2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class DemoCollection {

	public static void main(String[] args) {

		Emp e1 = new Emp("Ram", 400);
		Emp e2 = new Emp("Kumar", 500);
		Emp e3 = new Emp("Ramesh", 600);
		Emp e4 = new Emp("Kumar", 500);

		ArrayList<Emp> al = new ArrayList<>();

		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
	    //al.add(null);

		for (int i = 0; i < al.size(); i++) {
			Emp emp = al.get(i);
			System.out.println(emp.toString());
		}
		
		
		
		System.out.println("=============For each===============");
		//al.forEach( data -> System.out.println(data));
		al.forEach(( data) ->{ System.out.println(data);});
		
		System.out.println("========Iterator============");
		Iterator<Emp> empIter = al.iterator();
		while (empIter.hasNext()) {
			Emp emp = (Emp) empIter.next();
			System.out.println(emp.toString());

		}
		System.out.println("====enumeration=====");
		Enumeration<Emp> empEnum = Collections.enumeration(al);

		while (empEnum.hasMoreElements()) {
			Emp emp = (Emp) empEnum.nextElement();
			System.out.println(emp.toString());

		}

		Vector<Emp> v = new Vector<>();
		v.add(e1);
		v.add(e2);
		v.add(e3);
		v.add(e4);
		System.out.println("========Enumeration============");
 
		Enumeration<Emp> empEnum2 = v.elements();

		while (empEnum2.hasMoreElements()) {
			Emp emp = (Emp) empEnum2.nextElement();
			System.out.println(emp.toString());

		}

		Collections.synchronizedList(al);

	}

}

class Emp {

	String name;
	int id;

	public Emp(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}

}