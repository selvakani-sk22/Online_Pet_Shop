package in.selv2619;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddUserTest {
	
	/**
	 * To check valid mail and password
	 */
	@Test
	public void validUserEmail() {
		
		String email="selv2619@gmail.com";
		String Password="selv2625";
		boolean registerStatus=UserDetails.addUser(email, Password);
		assertTrue(registerStatus);
		
	}
	
	/**
	 * To Check invalid mail and valid password
	 */
	@Test
	
	public void inValidUserEmail() {
		
		String email="@selv2619.gmail.com";
		String Password="selv2625";
		boolean registerStatus=UserDetails.addUser(email, Password);
		assertFalse(registerStatus);
		
	}
	
	/**
	 * To check valid mail and password length less than 8
	 */
	
	@Test
		
		public void inValidPassword() {
			
			String email="selv2619@gmail.com";
			String Password="selv2";
			boolean registerStatus=UserDetails.addUser(email, Password);
			assertFalse(registerStatus);
			
		}

}
