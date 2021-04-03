package composition;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PersonWithAddress")
public class PersonWithAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "userName")
	private String name;

	@Column(name = "age")
	private int age;

	@Embedded
	private Address curAddress;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public Address getCurAddress() {
		return curAddress;
	}

	public void setCurAddress(Address curAddress) {
		this.curAddress = curAddress;
	}

	@Override
	public String toString() {
		return "PersonWithAddress [id=" + id + ", name=" + name + ", age=" + age + ", curAddress=" + curAddress + "]";
	}

	 
	
	
}