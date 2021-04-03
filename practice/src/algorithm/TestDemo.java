package algorithm;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestDemo {

public static char firstNonRepeatedCharacter(String word) { 
	
	
	HashMap<Character,Integer> map = new HashMap<>(); 

	for (int i = 0; i < word.length(); i++) {
	char c = word.charAt(i); 
	if (map.containsKey(c)) {
		map.put(c, map.get(c) + 1); } 
	else { map.put(c, 1);
	} 
	}  
	for (int i = 0; i < word.length(); i++) {
		char c = word.charAt(i); 
		if (map.get(c) == 1) {
			return c;
			}
		 
		}throw new RuntimeException("Undefined behaviour"); 
}
}




