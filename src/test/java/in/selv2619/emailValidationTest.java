package in.selv2619;

import static org.junit.Assert.*;

import org.junit.Test;

public class emailValidationTest {

	@Test
	public void test1() {
		String email="selvakanisk22@gmail.com";
		boolean result=emailValidation.isEmailValid(email);
		assertEquals(true,result);
		
	}
}
