package conditionalStatements;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) throws Exception {
		
		Class<?> c=Class.forName("conditionalStatements.User");
		Object obj=c.newInstance();
		Field ageField=c.getDeclaredField("name");
		ageField.setAccessible(true);
		ageField.set(obj, "hari");
		System.out.println(ageField.get(obj));
	}
}
