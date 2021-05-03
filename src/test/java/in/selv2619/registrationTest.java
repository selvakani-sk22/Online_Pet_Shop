package in.selv2619;

import static org.junit.Assert.*;

import org.junit.Test;

public class registrationTest {

	@Test
	public void validUserEmail() {
		
		String email="selv2619@gmail.com";
		String Password="selv2625";
		boolean registerStatus=userDetails.addUser(email, Password);
		assertTrue(registerStatus);
		
	}
	
	@Test
	
	public void inValidUserEmail() {
		
		String email="@selv2619.gmail.com";
		String Password="selv2625";
		boolean registerStatus=userDetails.addUser(email, Password);
		assertFalse(registerStatus);
		
	}

}
