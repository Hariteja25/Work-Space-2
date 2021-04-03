package threads.Synchronization;

class Withdraw extends Thread {
	int amount;
	Account fobj;

	Withdraw(Account fp, int amount) {
		fobj = fp;
		this.amount = amount;
	}

	public void run() {
		synchronized(fobj) {
		fobj.withdraw(amount);
		}
	}
}

