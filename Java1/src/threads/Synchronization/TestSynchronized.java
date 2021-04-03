package threads.Synchronization;

public class TestSynchronized  {
	public static void main(String[] args) {
		Account account = new Account();
		Withdraw ss = new Withdraw(account, 100);
		Withdraw ss1 = new Withdraw(account, 200);
		Withdraw ss2 = new Withdraw(account, 300);
		
		ss.start();
		ss1.start();
		ss2.start();
	}
}