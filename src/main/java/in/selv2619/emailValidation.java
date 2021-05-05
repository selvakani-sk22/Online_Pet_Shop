/**
 * 
 */
package in.selv2619;

import java.util.regex.Pattern; 

/**
 * @author selv2619
 *
 */
public class EmailValidation
{
	/**
	 * This method validate the mail format
	 * @param email
	 * @return
	 */
	
	public static boolean isEmailValid(String email)
	{
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@"+"(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
	
}
