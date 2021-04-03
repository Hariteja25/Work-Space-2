package TestService;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
A test class has
- One @BeforeAll method - 1 time before any thing
- beforeAll()
- One @AfterAll method - 1 time after everything thing
- afterAll()
- One @BeforeEach method - every time before every test method
- before()
- One @Test method - 1 time
- t1()
- t2()
- One @AfterEach method - every time after for every test method
- after()

O/p:
----
beforeAll is called

Before is called
T1 is called
after is called

Before is called
T2 is called
after is called

afterAll is called


Order of execution:
----------------------
beforeAll()

before()
t1()
after()


before()
t2()
after()

afterAll()

*/

public class TestAnnotations3 {

@BeforeAll
public static void beforeAll() {
System.out.println("beforeAll is called");
}

@AfterAll
public static void afterAll() {
System.out.println("afterAll is called");
}

@BeforeEach
public void before() {
System.out.println("Before is called");
}

@Test
public void t1() {
System.out.println("T1 is called");
}

@Test
public void t2() {
System.out.println("T2 is called");
}

@AfterEach
public void after() {
System.out.println("after is called");
}

}