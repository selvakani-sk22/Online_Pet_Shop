/**
 * 
 */
package in.selv2619;

/**
 * @author selv2619
 *
 */
public class UserLoginValidation {
	
	/**
	 * Metho to check given mail and password is valid or not for login
	 * @param email
	 * @param passWord
	 * @return
	 */
	
	public static boolean userloginValidation(String email,String passWord) 
	{
		
		//Login 
		
		boolean result=false;
		{
		if (UserDetails.searchDetails(email,passWord)==true) 
		{
			result=true;
			
		}

		return result;
	}
	}

	
}
