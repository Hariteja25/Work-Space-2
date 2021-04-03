package reflections;
/*
 How to access private method outside class?

Use Refelction API
1. create method object
2. and call setAccessible as true
3.call the  invoke method

syntax:
--------------------------------------------
private void print(String data) {
		System.out.println("welcome private function .. Your input = " +data);
}
  
Method m = c.getDeclaredMethod("print", new Class[] { String.class});
m.setAccessible(true);
m.invoke("kumar")
 */
import java.lang.reflect.*;

public class TestService2 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("reflections.Service");
		Service obj = (Service)c.newInstance();

		Method m = c.getDeclaredMethod("print", new Class[] { String.class});
		m.setAccessible(true);
		m.invoke(obj, "kumar");
		m.invoke(obj, "raj");
		m.invoke(obj, "shyam");
	}
}






