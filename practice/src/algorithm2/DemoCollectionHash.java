package algorithm2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class DemoCollectionHash {
	public static void main(String[] args) {
		Student s1 = new Student("Ram", 100);
		Student s2 = new Student("Ram", 100);
		Student s3 = new Student("Gopi", 200);
		Student s4 = new Student("Kumar", 300);
		HashSet<Student> hs = new HashSet<Student>();

		TreeSet<Integer> ts = new TreeSet<Integer>();

		ts.add(12);//
		ts.add(new Integer(31));//
		ts.add(3);//

		System.out.println(ts);

		// s2.equals(null)
		// s2.equals(s4)
		// s2.equals(e1)

		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		Iterator<Student> iterator = hs.iterator();

		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			System.out.println(student+"-------"+student.hashCode());
			System.out.println();
		}

	}
}

class Student {

	private String name;
	private int roll;

	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + roll;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (roll != other.roll)
			return false;
		return true;
	}

}