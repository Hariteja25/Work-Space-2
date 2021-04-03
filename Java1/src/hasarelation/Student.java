package hasarelation;

public class Student {
	int id;
	String fname;
	String lname;
	int semester;
	
	Address address;// addres obj as instance variable

	public Student(int id, String fname, String lname, int semester, Address address) {
		
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.semester = semester;
		this.address = address;
	}
	
	public void showStudentInfo() {
		System.out.println(id);
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(semester);
	}
}
