package Deserialization;
import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 111L;

int id;
transient String name;
transient int refNo;
public Student() {
	super();
}

static String userType1  ;

public int getRefNo() {
return refNo;
}

public void setRefNo(int refNo) {
this.refNo = refNo;
}

public static String getUserType() {
return userType1;
}

public static void setUserType(String userType) {
Student.userType1 = userType;
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

