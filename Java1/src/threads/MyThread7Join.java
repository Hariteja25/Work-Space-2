package threads;
/*
 - main thread has to wait until the other threads compltes the execution?
	 use join() funtion

 1. ready state -- th.start()
 2. running -- when cpu gives appointment to the thread, run() method is called.
 3. possible 3 states after running state
	  a. dead state or completed state    - run() method execution is complted 
	  b. wait state :   th1.join() --> main thread will wait for th1 to complte
	  c. sleep state : Thread.sleep(5000);
        
 */

public class MyThread7Join {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Start");
		
		Runnable  r = () -> {
			System.out.println("Thread stated:" + Thread.currentThread().getId() + " is running");
				try {
					Thread.sleep(5000);// wait for 5 seconds
				} catch (InterruptedException e) {
				e.printStackTrace();
				}
			System.out.println("Thread ended" + Thread.currentThread().getId() + " ended");
		};
		
		Thread  th1 =  new Thread(r);
		Thread  th2 =  new Thread(r);
		Thread th3 =  new Thread( r);
		
		th1.start();
		th2.start();
		th3.start();
		
		//use join method so that main method can wait
		th1.join();
		th2.join();
		th3.join();
		
		System.out.println("Bye");
	}


}
