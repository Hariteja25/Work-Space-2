package exceptions;
import java.util.Scanner;
/*
Requirement:

take input for name , age, city , usertype

validation for name, age , city usertype ,
 if invalid data found then throw exception for BusinessException

name cannot be > 12 char
age between 18 & 60
city should be either hyd or bang or cheanni
usertype should be admin or agent

*/
/*
 main() ----->  validateAndSave()
 
 validateAndSave() ---------->  validate()
 
 validate()-------------->register()----->
 
 validate()  :   create exception obj using throw for  BusinessException
 
 main()      :    exception handling using try + catch
 
 validateAndSave() :   declares throws.
 */


public class TestRegistration {

public static void main(String[] args) {
	System.out.println("Welcome!! Please enter the peron info");

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter name");
	String name = sc.next();

	System.out.println("Enter age");
	int age = sc.nextInt();

	System.out.println("Enter city");
	String city = sc.next();

	System.out.println("Enter userType");
	String userType = sc.next();

	Person person = new Person(name, age, city, userType);

	
	try {
		validateAndSave(person);
		System.out.println("Registration success");
	} catch (BusinessException e) {
		String errCode = e.getErrCode();
		System.out.println(e.getMessage());
		System.out.println(errCode);
	}
	
}

private static void validateAndSave(Person person) 
		throws BusinessException{
	validate(person);
	System.out.println("peson data processed"+person);
	
	
}

private static void validate(Person person)
		throws BusinessException {

	if (person.getAge() < 18 || person.getAge() > 60) {
		BusinessException ex = new BusinessException("ERRO1","age is invalid");
		throw ex;
	}

	if (!(person.getCity().equals("hyd") || 
			person.getCity().equals("bangalore") || person
			.getCity().equals("chennai"))) {
		throw new BusinessException("ERRO2","unsupported city");
	}

	if (!(person.getUserType().equals("agent")
			|| person.getUserType()
			.equals("admin"))) {
		throw new BusinessException("ERRO3","invalid usertype");
	}
	
	if (person.getName().length() > 12) {
		BusinessException ex = new BusinessException("ERRO4","name is invalid");
		throw ex;
	}
	register(person);

}

private static void register(Person person) {
	// code to save the person info in db
	System.out.println("data saved to db.");
}

}



