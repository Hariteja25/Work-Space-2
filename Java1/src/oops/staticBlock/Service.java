 package oops.staticBlock;

public class Service {
	//instance varible
		String dbName;
		
		//Constructor
		public Service(String dbName) {
			System.out.println("in constructor");
			this.dbName = dbName;
		}
			
		//static variable
		static double rateOfIntrest;
		
		//static block
		static {
			System.out.println("inside the static block");
			rateOfIntrest = 13.23f;
		}
		

}
