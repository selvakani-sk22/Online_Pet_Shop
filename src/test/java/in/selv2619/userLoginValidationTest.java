package in.selv2619;

import static org.junit.Assert.*;

import org.junit.Test;

public class userLoginValidationTest {

	@Test
	public void loginValidationTest() {
		
		String email="selvakanisk22@gmail.com";
		String passWord="selv2619";
		boolean result=userLoginValidation.userloginValidation(email, passWord);
		assertEquals(true,result);
		
	}

}
