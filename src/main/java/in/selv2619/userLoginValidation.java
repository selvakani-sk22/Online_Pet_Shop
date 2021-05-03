/**
 * 
 */
package in.selv2619;

/**
 * @author selv2619
 *
 */
public class userLoginValidation {
	public static boolean userloginValidation(String email,String passWord) 
	{
		
		//Login 
		
		boolean result=false;
		{
		if (userDetails.searchDetails(email,passWord)==true && emailValidation.isEmailValid(email)) 
		{
			result=true;
			
		}

		return result;
	}
	}

	
}
