package hasaAndIsaRelation;

public class Address {
	private String hno;
	private String streetName;
	private String city;
	private String state;
	private String country;
	private String pin;
	
	public Address(String hno, String streetName, String city, String state, String country, String pin) {
		super();
		this.hno = hno;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
	}

	public void displayAddress(){
		System.out.println(hno);
		System.out.println(streetName);
		System.out.println(city);
		System.out.println(state);
		System.out.println(country);
		System.out.println(pin);
	}}


