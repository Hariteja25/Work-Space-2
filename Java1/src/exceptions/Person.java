package exceptions;
public class Person {

	private String name;

	private int age;
	private String city;
	private String userType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Person(String name, int age, String city, String userType) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.userType = userType;
	}

}

