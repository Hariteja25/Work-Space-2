package HashMap;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		HashMap<String,String> m=new HashMap<String,String>();
		
		m.put("one", "first");
		m.put("two", "second");
		m.put("three", "third");
		System.out.println(m);
		for(String  s:m.keySet()) {
			if(s.equals("two")) {
				m.put("four", "4");
			}
		}
		System.out.println(m);
		
	}

}
