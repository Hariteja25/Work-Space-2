package threads.Synchronization;

import java.util.*;

public class TestWithoutSync {
	public static void main(String[] args) throws InterruptedException {
		Person person=new Person(5);//create person obj with 5 as initial value.
		//print initial count
		System.out.println("Initial count=" +person.count);
		
		List<Thread> threads= new ArrayList<Thread>();
		//create 10 threads
		for(int i=1; i<=10; i++) {
			Thread th= new MyThreadWithoutSync(person);
			th.start();
			threads.add(th);
		}
		//main thread has to wait
		for(Thread t:threads) {
			t.join();
			
		}
		//print final count
		
		System.out.println("Final count=" +person.count);
			
		
}

}
