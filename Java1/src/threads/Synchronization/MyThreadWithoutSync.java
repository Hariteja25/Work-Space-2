package threads.Synchronization;

public class MyThreadWithoutSync extends Thread {

	Person person;

	public MyThreadWithoutSync(Person person) {
		super();
		this.person = person;
	}

	public void run() {
		try {
			Thread.sleep(7000);
		 	person.count = person.count + 5;
		 } catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}