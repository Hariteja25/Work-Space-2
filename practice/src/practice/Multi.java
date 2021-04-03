package practice;

public class Multi implements Runnable{

	public void run() {
		System.out.println(Thread.currentThread()+"Hai from the Thread run()");
	}

}
