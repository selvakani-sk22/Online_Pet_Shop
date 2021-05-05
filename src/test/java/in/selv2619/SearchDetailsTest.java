package in.selv2619;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchDetailsTest {

	/*
	 * To add and search a particular mail and password present in the list
	 */
	
	@Test
	
	public void SearchValidMailAndPassword()
	{
		
		String email="selvakanisk22@gmail.com";
		String password="selv2619";
		UserDetails.addUser(email, password);
		boolean isContain=UserDetails.searchDetails(email,password );
		assertTrue(isContain);
		
	}
	
	/*
	 * To Search a Mail and Password without adding to list
	 */
	
	@Test
		
		public void SearchInValidMailAndPassword()
		{
			
			String email="selvakanisk@gmail.com";
			String password="selv2629";
			boolean isContain=UserDetails.searchDetails(email,password );
			assertFalse(isContain);
			
		}

}
