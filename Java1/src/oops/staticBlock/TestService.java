package oops.staticBlock;

public class TestService {
	public static void main(String[] args) {
		 Service s1 = new Service("oracle");//static block and constructr are executed
		 Service s2 = new Service("sql");//only constructr is executed
		 Service s3 = new Service("hana");//only constructr is executed
	}

}
