package hasarelation;

public class TestStudent {
	public static void main(String[] args) {
		//create addres sobj
		Address addr = new Address("yyyyy road", "bangalore", "KA", "in", 24242);
		
		//create student obj with data
		Student s = new Student(2121, "ram", "kumar", 3, addr);
		
		//print Student info
		s.showStudentInfo();
		
		//print address info
		s.address.showAddress();
	}

}
