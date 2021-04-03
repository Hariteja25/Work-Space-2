package enumClass;
/*
Assignment:

application suppports follwoing usertypes:
     ADMIN,
	AGENT,
	CUSTOMER,
	SUPERUSER,
	SUPERVISOR;
  
  
write prog to take usertype as input and print whether its a valid usertype or not
  */

public enum UserType {

	ADMIN,
	AGENT,
	CUSTOMER,
	SUPERUSER,
	SUPERVISOR;
	
	 public static boolean isValidUserType(String input) {
			UserType[] objs = UserType.values();// get all objs
		
			boolean found= false;
			for(UserType obj :objs) { // compare input with each usertype
				if(input.equals(obj.toString())) {
					found= true;
					break;
				}
			}
			return found;
		}
	  
	
  
}
  