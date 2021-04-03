package enumClass;

public class TestLoanType {
public static void main(String[] args) {
	
	System.out.println("*********** GET HOME OBJ ***********");
	LoanType home = LoanType.HOME;
	System.out.println(home.getCode());
	System.out.println(home.getDesc());
	
	
	System.out.println("*********** GET PERSONAL OBJ ***********");
	LoanType loan = LoanType.PERSONAL;
	System.out.println(loan.getCode());
	System.out.println(loan.getDesc());
	

	System.out.println("*********GET ALL LOANS**************");
	for(LoanType loanType : LoanType.values()){
		System.out.println(loanType.name() 
				+ ", " +loanType.getCode()+" ,"
				+loanType.getDesc());
	}
	
}
}


