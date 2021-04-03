package Ex11;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapCompar {

public static void main(String args[]) {

TreeMap<Employee, String> Map = new TreeMap<>(new EmpComparator());

Map.put(new Employee("rAJU", "RAVI", 7328), "0001");
Map.put(new Employee("HARI", "SAI", 1012), "0002");
Map.put(new Employee("ANIL", "RAM", 879), "0003");


Set<Entry<Employee, String>> set = Map.entrySet();
Iterator<Entry<Employee, String>> iterator = set.iterator();
while (iterator.hasNext()) {
Map.Entry mapEntry = (Map.Entry) iterator.next();
System.out.println((Employee) mapEntry.getKey() + " : " + mapEntry.getValue());

}

}
}