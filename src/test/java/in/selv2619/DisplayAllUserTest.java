package in.selv2619;

//import static org.junit.Assert.*;

import org.junit.Test;

public class DisplayAllUserTest {

		/**
		 * To add with valid mail and password and Display
		 */
	
		@Test
		public void validUserEmailAndPassword() {
			
			String email="selv2619@gmail.com";
			String Password="selv2625";
			UserDetails.addUser(email, Password);
			UserDetails.displayAllUsers();
		}
		
		
		/**
		 * To add with invalid mail and password and display
		 */
		
		@Test
		public void invalidUserEmailAndValidPassword() {
			
			String email="@selv2619.gmail.com";
			String Password="selv2625";
			UserDetails.addUser(email, Password);
			UserDetails.displayAllUsers();
		}
		
		/**
		 * To add with invalid mail and password and display
		 */
		
		@Test
		public void validUserEmailAndInValidPassword() {
			
			String email="selv2619@gmail.com";
			String Password="selv2";
			UserDetails.addUser(email, Password);
			UserDetails.displayAllUsers();
		}
}


