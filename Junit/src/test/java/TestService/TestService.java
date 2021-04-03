package TestService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import service.Service;

public class TestService {

Service service = new Service();


@Test
public void testValidCity1() {
//1.Prepare test data
String input ="hyderabad";

//2.call the method
boolean actual = service.isValidCity(input);

//3.verify/validate/assert the results
Assertions.assertTrue(actual, "expected valid city");
}

@Test
public void testValidCity2() {
//1.Prepare test data
String input ="bangalore";

//2.call the method
boolean actual = service.isValidCity(input);

//3.verify/validate/assert the results
Assertions.assertTrue(actual, "expected valid city");
}

@Test
public void testValidCity3() {
//1.Prepare test data
String input ="chennai";

//2.call the method
boolean actual = service.isValidCity(input);

//3.verify/validate/assert the results
Assertions.assertTrue(actual, "expected valid city");
}


@Test
public void testValidCity4() {
//1.Prepare test data
String input ="pune";

//2.call the method
boolean actual = service.isValidCity(input);

//3.verify/validate/assert the results
Assertions.assertFalse(actual, "expected invalid city");
}


@Test
public void testValidCity5() {
//1.Prepare test data
String input ="";

//2.call the method
boolean actual = service.isValidCity(input);

//3.verify/validate/assert the results
Assertions.assertFalse(actual, "expected invalid city");
}


@Test
public void testValidCity6() {
//1.Prepare test data
String input =null;

//2.call the method
boolean actual = service.isValidCity(input);

//3.verify/validate/assert the results
Assertions.assertFalse(actual, "expected invalid city");
}
}