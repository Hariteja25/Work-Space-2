package threads;
/*
 Req:
create a thread and start the thread using Thread class

solution:
------------------------
create a class extending Thread class and provide run method

1.Create thread class:

 */

public class TestMyThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("start");

		MyThread th1 = new MyThread();
		th1.setName("my Thread1"); // thread name
		th1.setPriority(10);// thread priority [ 1 to 10]
		


		th1.start();

	}
}
/*
//How many thread are created.
//2

by default java creates main thread.
using main thread developer will create additional threads.

*/