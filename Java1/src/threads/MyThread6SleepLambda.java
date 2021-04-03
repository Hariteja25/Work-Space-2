package threads;

public class MyThread6SleepLambda {
	public static void main(String[] args) {
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
		
		System.out.println("Bye");
	}
}

   
