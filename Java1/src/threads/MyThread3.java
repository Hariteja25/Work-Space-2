package threads;


public class MyThread3 implements Runnable {

	public void run() {
		System.out.println("Thread " + Thread.currentThread() + " is running");
	}
}

