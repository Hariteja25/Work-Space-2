package collections.hashSet;
public class TestHashSetPerson3 {
	public static void main(String[] args) {
		Person p1 = new Person(123, "user5", 45);

		Person p2 = new Person(123, "user5", 45);
		
		Person p3 = new Person(123, "user5", 45);

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
	}
}
//If two objs are equal then their hashcode will also be same.


