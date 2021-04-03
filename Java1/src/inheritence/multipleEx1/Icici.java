package inheritence.multipleEx1;
	public class Icici extends MyBank implements WorldBank , RBI{

		public void createAccount() {
			System.out.println("ICICI :createAccount ");
			
		}

		public void processLoan() {
			System.out.println("ICICI :processLoan ");
		}

		public void demat() {
			System.out.println("ICICI :demat ");
		}

	}


