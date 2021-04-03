package Ex7;

import java.util.List;

public class UserService { 
	String userName;
	List<String> envs;
	List<Integer> num;
	
	public UserService(String userName, List<String> envs, List<Integer> num) {
		super();
		this.userName = userName;
		this.envs = envs;
		this.num = num;
	}

	public List<String> getEnvs() {
		return envs;
	}

	public List<Integer> getNum() {
		return num;
	}

	public String getUserName() {
		return userName;
	}


}
/**
UserService is a bean class.
UserService has userName and "envs"(list)  as dependency.
spring has to create the obj for UserService and set the data for "userName" and "envs"(list).
since we are using constr injection we need to write the constructor in UserService
and write bean tag with two constructor-arg tags in springs.xml
 */