package hasarelation;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create addres sobj
	Address addr1 = new Address("yyyyy road", "bangalore", "KA", "in", 24242);
	Address addr2 = new Address("aaaa road", "hyd", "TS", "in", 5567);
	Address addr3 = new Address("ssss road", "kdp", "AP", "in", 66662);

	Employee e= new Employee(12,"kumar",1234,15566,addr1,addr2,addr3);
	e.showEmployeeInfo();
	e.currAddress.showAddress();
	e.perAddress.showAddress();
	e.officAddress.showAddress();
				
			}

	}


