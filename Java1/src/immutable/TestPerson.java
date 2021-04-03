package immutable;

public class TestPerson {
public static void main(String[] args) {
	
	Person p = new Person(2000,"kumar", 30);
    // object p cannot be changed
	
	System.out.println(p.getId());
	System.out.println(p.getName());
	System.out.println(p.getAge());
}
}
