/**
 * 
 */
package in.selv2619;

import java.util.HashMap;
import java.util.Set;

/**
 * @author selv2619
 *
 */
public class UserDetails {
	
	/**
	 * Hash map to store user mail id and password
	 */
static HashMap<String, String> userList = new HashMap<String, String>();
	
	/**
	 * Add user details to list
	 * 
	 * @param User Email
	 * @param Password
	 * return
	 */

	public static boolean addUser(String userEmail, String passWord)
	{
		boolean addedStatus=false;
		
		if(EmailValidation.isEmailValid(userEmail)==true  && searchDetails(userEmail,passWord)==false && passWord.length() >=8)
		{
		userList.put(userEmail, passWord);
		addedStatus=true;
		}
		
		return addedStatus;

	}
	
	
	/**
	 * Display All Registered Users
	 */
	
	
	public static void displayAllUsers() 
	{
		
		Set<String> keys = userList.keySet();
		System.out.println("................................ Registered Users ................................");
		for (String key : keys) {
			String value = userList.get(key);
			System.out.println("\n User Email : " +key+ "\n Password : " +value);
		}
		System.out.println("..................................................................................");
		
	}
	
	
	/**
	 * Method to check whether the given mail id & password in the list
	 * 
	 * @param userEmail
	 * @param password
	 * return
	 */
	
	
	public static boolean searchDetails(String userEmail,String password)
	{
		
		boolean validUserId = false;
		if(userList.containsKey(userEmail) && userList.containsValue(password)) {
			validUserId = true;
		}

		return validUserId;
	}
	
	/**
	 * This method is used to validate the user mail and password for login
	 * @param userEmail
	 * @param password
	 * return
	 */
	
	public static boolean loginValidation(String email,String password)
	{
		boolean isValid=false;
		
		if(UserLoginValidation.userloginValidation(email,password)==true)
		{
			isValid=true;
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
		return isValid;
	}
	
}
