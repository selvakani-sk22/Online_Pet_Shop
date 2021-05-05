package in.selv2619;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginValidationTest {

	@Test
		// with correct mail and password
	
		public void validMailAndPassword() {
			
			String email="selv2619@gmail.com";
			String Password="selv2625";
			boolean loginStatus=UserDetails.loginValidation(email, Password);
			assertTrue(loginStatus);
			
		}
	
	@Test
	//Invalid Mail not in user list
	
		public void inValidMail() {
			
			String email="selv2619@gmail.com";
			String Password="selv2625";
			boolean loginStatus=UserDetails.loginValidation(email, Password);
			assertFalse(loginStatus);
			
		}
		
	@Test
		//Incorrect Mail format
	
		public void inCorrectMail() {
			
			String email="selv@2619.gmail.com";
			String Password="selv2625";
			boolean loginStatus=UserDetails.loginValidation(email, Password);
			assertFalse(loginStatus);
			
		}
	
	@Test
	//Valid Mail with wrong password
	
		public void inValidPassword() {
			
			String email="selv2619@gmail.com";
			String Password="selv17";
			boolean loginStatus=UserDetails.loginValidation(email, Password);
			assertFalse(loginStatus);
			
		}
	
	
	
}
