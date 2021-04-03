package Ex11;


	/**
	Req:
	AccountService has dbName as dependency
	UserService has "userName" and "accountService" obj as dependency.

	AccountService.java:
	--------------------------
	- has save() method

	UserService.java:
	---------------------
	- has saveUser() method 
	- saveUser() internally calls the save() method of AccountService.

	Create obj for UserService and call the saveUser() method.

	 */
	  
	public class AccountService {

		private String dbName;
		
		public void save() {
			System.out.println("inside m2");
		}
		
		public String getDbName() {
			return dbName;
		}

		public void setDbName(String dbName) {
			this.dbName = dbName;
		}
		
		
		public void initProcess(){
			System.out.println("in init");
		}
		
		public void close(){
			System.out.println("close");
		}
	}
	 
	 