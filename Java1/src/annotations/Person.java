package annotations;


public class Person {
	
	@Size(value=5)
	private String id;

	@Size(value= 7)
	private String name;

	public Person(String id) {
		super();
		this.id = id;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
