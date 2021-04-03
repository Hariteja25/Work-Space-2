package algorithm2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Fail_fast_Fail_safe {

	public static void main(String[] args) {
		/*
		 * In this Collection the Modification is not allowed while Iterating over it.So
		 * Fail-Fast iterators will Throw the ConcurrentModificationException.
		 */
		// First run with the MAP and observe how the Exception is thrown and Where
	//	Map<String, Integer> map = new HashMap<>();
		// To overcome the requirement then we will go with Fail-Safe Interators.

		/*
		 * Unlike the fail-fast iterators, these iterators traverse over the clone of
		 * the collection. So even if the original collection gets structurally
		 * modified, no exception will be thrown.
		 */

		/*
		 * You can Observe here by running with Concurreny(Put MAP in comment Line 17
		 * While running with the Concurency Collection) collection that Modifying the Collection
		 * while iterating without throwing any exception
		 */
	    ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
		map.put("Rama", 1);
		map.put("Narashimha", 2);
		map.put("Sharma", 3);
		
		System.out.println("===========Enhanced loop=====");
		for(Entry<String,Integer> e:map.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

		System.out.println("====Iterator====");
		// To Iterate the Elements
		Iterator<Entry<String, Integer>> ite = map.entrySet().iterator();
		while (ite.hasNext()) {
			// System.out.println(ite.hasNext());

			Map.Entry<String, Integer> pair = (Map.Entry<String, Integer>) ite.next();
			System.out.println(pair.getKey() + " : " + pair.getValue());

			/*
			 * While using MAP at the Below Line 38, The Exception is thrown because below
			 * line of code trying to modify or insert the data into collection while over
			 * Iterating.the modification will not allow by Fail_Fast Iterators so
			 * ConcurrentModificationException will be thrown by the Iterator.
			 */
			map.put("Thogarchati", 4);
			map.put("Ram", 5);
		}
		// System.out.println(ite.hasNext());

	}

}
