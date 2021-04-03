package serialization;
/*
   
  Req:
  Student has id , name ,refNo
  perform Seralizationn and Deserialization  for obj
  
  
  step1:
  Class has to implement Serializable interface
  
 */

import java.io.Serializable;

public class Student implements Serializable {

	int id;
	String name;
	transient int refNo;

	public int getRefNo() {
		return refNo;
	}

	public void setRefNo(int refNo) {
		this.refNo = refNo;
	}

	public static String getUserType() {
		return userType;
	}

	public static void setUserType(String userType) {
		Student.userType = userType;
	}

	public static String userType = "";

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

	public Student(int id, String name, int refNo) {
		super();
		this.id = id;
		this.name = name;
		this.refNo = refNo;
	}
}

  
  


