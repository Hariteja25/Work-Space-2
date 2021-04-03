package Annotations.Autowire;

import org.springframework.stereotype.Repository;

@Repository
public class RegisterDAO {

	public void save() {
		System.out.println("saved");
	}
	
}
