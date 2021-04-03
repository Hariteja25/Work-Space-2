package threads;

public class MyThread extends Thread {
	public void run() {
		System.out.println(Thread.currentThread()+"Hi.. from the thread run method");
	}
}
