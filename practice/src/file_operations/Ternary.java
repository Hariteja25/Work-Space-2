package file_operations;

public class Ternary {
	public static void main(String[] args) {
		int age=9;
		Ternary t=new Ternary();
		if(t.validateAge(age)) {
			System.out.println("valid age");
		}
		else {
			System.out.println("invalid age");
		}
	}
	
	
	public boolean validateAge(int age){

	   return age>18 ? true:false ;
	}
  
  
  }

  
