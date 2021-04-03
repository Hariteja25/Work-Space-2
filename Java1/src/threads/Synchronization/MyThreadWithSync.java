package threads.Synchronization;
/*
 *Req: 
 a person obj has a count with inital value as 5.
 share the same person obj to 10 different threads.
 every Thread has to add +5 to the count for the person obj at the same time.
  
 
  ex: 
  count initial value is 5
  count final value ==========>  55
  
  when one object/variable is shared across multiple threads;
 and every thread is trying to modify same object/variable ====> data inconsistency.
 
Solution:
use synchronized block
use synchronized method

synchronized -> will ensure at a time ony one thread to execute and other threads are in waiting state.

at a time only one thread should modify the object/variable. 
 -synchronized method : locks the entire method. other threads has to be in waiting state
 -synchronized  block : it will not lock entire method ; it locks only small porting of code inside the method.
 
  synchronized method:
 --------------------------------------------------------------------------
  public synchronized void run() {
		try {
			Thread.sleep(7000);
			person.count = person.count + 5;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
 This will lock all the lines inside the run method ; 
 at a time only one thread will execute run method
 this leads to perforamce issue.
 
 
 synchronized block:
 --------------------------------------------------------------------------
 public void run() {
		try {
			Thread.sleep(7000);
			synchronized (person) {
				person.count = person.count + 5;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
This will not lock all the lines inside the run method ; 
only the line "person.count = person.count + 5;" is eeceuted one thread at a time.

 */

public class MyThreadWithSync extends Thread {
	Person person;

	public MyThreadWithSync(Person person) {
		super();
		this.person = person;
	}

	public void run() {
		try {
			Thread.sleep(7000);
			synchronized (person) {
				person.count = person.count + 5;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
