package threads.Synchronization;
/*
 Req:
account obj is shared across multiple threds.
every thred is performing withdraw on same account obj.
ensure the data consistency.

 */

class Account  {
	int bal = 6000;
	public  void withdraw(int amt) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			bal = bal-amt;
			
			System.out.println("amt withdraw = "+amt +"final bal=" +bal);
	}
}