package collections.hashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
  <deptname>#<employeeId>

one dept has multiple employees.

i/p:


d1#e1
d2#e2
d1#e3
d3#e4
d7#e5
d4#e6
d5#e7
d7#e8
d1#e9
d2#e10


O/p:
String  --->  List of string
------------------------------------
d1  	---> e1, e3 , e9
d2 		---> e2 , e10
d3 		---> e4
d4 		---> e6
d5 		---> e7
d7 		---> e5 ,e8

 */
public class MapDeptEmp {
public static void main(String[] args) {
	List<String> input = Arrays.asList("d1#e1","d2#e2","d1#e3", "d3#e4" ,"d7#e5", "d4#e6", "d5#e7",
						"d7#e8", "d1#e9", "d2#e10");
	
	Map<String ,List<String >> map = new HashMap<>();
	//key = deptid
	//value = list of empId
	
	//iterate each input
	for(String data: input) {
		//perform split
		String[] deptAndEmp = data.split("#");
		String dept = deptAndEmp[0];
		String emp = deptAndEmp[1];
		
		List<String> emps = null;
		if(map.containsKey(dept)) {
			emps = map.get(dept);
		}else {
			emps = new ArrayList<>();
		}
		emps.add(emp);
		map.put(dept,emps);
	}
	
	
	//print logic
	for(Entry<String ,List<String >> entry : map.entrySet()) {
		System.out.println("***************************************");
		System.out.println(entry.getKey());
		for(String emp : entry.getValue()) {
			System.out.println(emp);
		}
	}
	
}
}

