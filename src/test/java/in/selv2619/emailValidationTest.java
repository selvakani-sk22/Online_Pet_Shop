package in.selv2619;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmailValidationTest {

	/**
	 * This method is used to check the valid Email
	 */
	
	@Test
	
	public void validEmail() {
		
		String email="selvakanisk22@gmail.com";
		boolean result=EmailValidation.isEmailValid(email);
		assertTrue(result);
	}

	/**
	 * This Method is used to check the Invalid Email
	 */
	
	@Test
		
		public void inValidEmail() {
			
			String email="@selvakanisk22.gmail.com";
			boolean result=EmailValidation.isEmailValid(email);
			assertFalse(result);
		}
}
