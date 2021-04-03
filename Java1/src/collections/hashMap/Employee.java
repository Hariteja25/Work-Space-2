package collections.hashMap;
/*
 Req:
Map with string as key and employee obj as value

syntax:
Map<String, Employee> map = new HashMap<>();


 */

public class Employee {
	
	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	private String name;
	private int id;
	private String pan;
	
	public Employee(String name, int id, String pan) {
		super();
		this.name = name;
		this.id = id;
		this.pan = pan;
	}
	
	public Employee(int id, String name, String pan) {
		super();
		this.name = name;
		this.id = id;
		this.pan = pan;
	}
	 
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", pan=" + pan + "]";
	}

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pan == null) ? 0 : pan.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pan == null) {
			if (other.pan != null)
				return false;
		} else if (!pan.equals(other.pan))
			return false;
		return true;
	}
	 
}
