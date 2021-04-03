package constr;

import java.util.Map;
import java.util.Map.Entry;

public class EmployeeController{

//instance varible
Map<String,String> map1;



//constr
public EmployeeController(Map<String, String> props) {
this.map1 = props;
}

public void process() {

//iterate the map
for(Entry<String,String> entry : map1.entrySet()){
System.out.println(entry.getKey());
System.out.println(entry.getValue());
}
}

}


