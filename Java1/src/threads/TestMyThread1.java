package threads;

public class TestMyThread1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("start");

		MyThread th1 = new MyThread();
		th1.setName("my Thread1"); // thread name
		th1.setPriority(10);// thread priority [ 1 to 10]
		
		MyThread th2 = new MyThread();
		th2.setName("my Thread2");
		th2.setPriority(5);

		MyThread th3 = new MyThread();
		th3.setName("my Thread3");
		th3.setPriority(2);

		th1.start();
		th2.start();
		th3.start();

		System.out.println("Bye");
	}
}
