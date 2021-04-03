package encapsulation;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		c.setFname("mahesh");
		c.setLname("kumar");
		c.setMobile(45456);
		c.setEmail("ddhhdddbbd");
		c.setCity("hyd");
		System.out.println(c.getFname());
		System.out.println(c.getLname());
		System.out.println(c.getMobile());
		System.out.println(c.getEmail());
		System.out.println(c.getCity());

	}

}
