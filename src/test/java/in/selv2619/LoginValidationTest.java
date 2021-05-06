package in.selv2619;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginValidationTest {

	/**
	 * with correct mail and password
	 */
	@Test
	
		public void validMailAndPassword() {
			
			String email="selv2619@gmail.com";
			String password="selv2625";
			boolean loginStatus=UserDetails.loginValidation(email, password);
			assertTrue(loginStatus);
			
		}
	
	/**
	 * Invalid Mail not in user list
	 */
	
	@Test
	
		public void inValidMail() {
			
			String email="selv2619@gmail.com";
			String password="selv2625";
			boolean loginStatus=UserDetails.loginValidation(email, password);
			assertFalse(loginStatus);
			
		}
		
	/**
	 * Incorrect Mail format
	 */
	
	@Test
	
		public void inCorrectMail() {
			
			String email="selv@2619.gmail.com";
			String password="selv2625";
			boolean loginStatus=UserDetails.loginValidation(email, password);
			assertFalse(loginStatus);
			
		}
	
	/**
	 * Valid Mail with wrong password
	 */
	
	@Test
	
		public void inValidPassword() {
			
			String email="selv2619@gmail.com";
			String password="selv17";
			boolean loginStatus=UserDetails.loginValidation(email, password);
			assertFalse(loginStatus);
			
		}
	
	
	
}
