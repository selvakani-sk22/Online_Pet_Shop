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
public class userDetails {
	
	/*
	 * Hash map to store user mail id and password
	 */
static HashMap<String, String> userList = new HashMap<String, String>();
	
	/*
	 * Add user details to list
	 * 
	 * @param User Email
	 * @param Password
	 * return
	 */

	public static boolean addUser(String userEmail, String passWord)
	{
		boolean addedStatus=false;
		
		if(emailValidation.isEmailValid(userEmail)==true)
		{
		userList.put(userEmail, passWord);
		addedStatus=true;
		}
		
		return addedStatus;

	}
	
	
	/*
	 * Display All Registered Users
	 */
	
	
	public static void displayAllUsers() {
		Set<String> keys = userList.keySet();
		System.out.println("................................ Registered Users ................................");
		for (String key : keys) {
			String value = userList.get(key);
			System.out.println("\n User Email : " +key+ "\n Password : " +value);
		}
		System.out.println("..................................................................................");
	}
	
	
	/*
	 * Method to check whether the given mail id & password in the list
	 * 
	 * @param userEmail
	 * @param password
	 * return
	 */
	
	
	public static boolean searchDetails(String userEmail,String password) {
		boolean validUserId = false;
		if(userList.containsKey(userEmail) && userList.containsValue(password)) {
			validUserId = true;
		}

		return validUserId;
	}
}
