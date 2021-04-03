package threads;
/*
 Req:
create a thread and start the thread using Lambda expression

solution:
------------------------
Apply using Lambda expression to start the thread
 */

public class MyThread4Test {

	public static void main(String[] args) {
		System.out.println("main : start");
		
		Runnable  r = () ->  { System.out.println("Thread " + Thread.currentThread() + " is running");	};
		
		Thread  th1 =  new Thread(r);
		Thread  th2 =  new Thread(r);
		Thread th3 =  new Thread( 
				() ->  { 
					System.out.println("My new style of Thread " + Thread.currentThread() + " is running");	
					}
				);
		
		th1.start();
		th2.start();
		th3.start();		
		
		System.out.println("main :end"); 
	}
}