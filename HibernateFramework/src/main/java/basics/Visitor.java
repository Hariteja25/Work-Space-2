package basics;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


   @Entity
   @Table(name = "VisitorDetails") // table name , Vistor class is associated with VisitorDetails table.
   public class Visitor{
	   @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)  // generates id automatically
    @Column(name="id") //db column name
    private int myId;
    
    
    @Column(name="name") //db column name
    private String myName;
    
    @Column(name="city") //db column name
    private String myCity;
    
    @Column(name="salary") //db column name
    private int userSalary;
    //setters and getters
    

	public int getMyId() {
		return myId;
	}

	public void setMyId(int myId) {
		this.myId = myId;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public String getMyCity() {
		return myCity;
	}

	public void setMyCity(String myCity) {
		this.myCity = myCity;
	}

	public int getUserSalary() {
		return userSalary;
	}

	public void setUserSalary(int userSalary) {
		this.userSalary = userSalary;
	}
      
   
    
   }