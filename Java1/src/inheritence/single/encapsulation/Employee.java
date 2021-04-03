package inheritence.single.encapsulation;
	public class Employee extends Person{

		private String pan;
		private String pfNo;
		
		public String getPan() {
			return pan;
		}

		public void setPan(String pan) {
			this.pan = pan;
		}

		public String getPfNo() {
			return pfNo;
		}



		public void setPfNo(String pfNo) {
			this.pfNo = pfNo;
		}

		public void displayEmp(){
			System.out.println(pan);
			System.out.println(pfNo);
		}
	}


