package TestService;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAnnotations1 {

	@BeforeEach
	public void before() {
		System.out.println("Before is called");
	}

	@Test
	public void t1() {
		System.out.println("T1 is called");
	}

	@AfterEach
	public void after() {
		System.out.println("after is called");
	}

}