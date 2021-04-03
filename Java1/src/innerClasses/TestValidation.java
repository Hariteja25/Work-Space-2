package innerClasses;

public class TestValidation {
public static void main(String[] args) {
	
	Validation v=new Validation() {
		
		@Override
		void validate() {
			// TODO Auto-generated method stub
			System.out.println("Customer Validation done");
		}
	};
	v.validate();
	
Validation v2=new Validation() {
		
		@Override
		void validate() {
			// TODO Auto-generated method stub
			System.out.println("Employee Validation done");
		}
	};
	v2.validate();
}
}
