/**
 * 
 */
package in.selv2619;
/**
 * @author selv2619
 *
 */
public class ShopManager {

	public static void main(String[] args) {
		
		
		/*
		 * To show breed types 
		 */
		
		
		breedTypes.addBreedType();
		breedTypes.displayBreedTypes();
		
		
		/*
		 * To add user details by calling addUser() method
		*/
		
		
		userDetails.addUser("selvakanisk22@gmail.com","selv2619");
		userDetails.addUser("klissk2225@gmail.com","klis2225");
		
		
		/*
		 * Call display Registered Users Method
		 */
		
		
		userDetails.displayAllUsers();
		
	
			
		/*
		 * To check valid user or not for login 
		 */
		
		
		String email="selvakanisk22@gmail.com";      //input1 : Email for login validation
		String password="selv2619";                  //input2 : Password for login validation
		
		
		if(userLoginValidation.userloginValidation(email,password)==true)
		{
			
			System.out.println("\n\nLogged in successfully...Welcome to Pets Paw\n\n");
			
			
			System.out.println("Select which cutiee you want to take to home...");
			
			
			String userSelectedBreedType="Shitzu";       //input to select breed type
			
			
			int breedCount=2;                            //input to get no.of dogs want to buy
			
			
			int breedPrice=breedTypes.userSelectedBreedType(userSelectedBreedType);                           //To get the selected breed price per count
			
			
			String breedCountStatus=breedTypes.breedCountStatus(userSelectedBreedType,breedCount);            //to get the breed count status 
			
			
			double priceWithGst=priceCalculation.breedPriceCalculation(breedCount, breedPrice);               //Price Estimation with Gst
			
			
			System.out.println("\nYou have selected......\n\n Breed Type : " +userSelectedBreedType + " \n Breed Price(each) : " +breedPrice +" Rs/-");
			
			
			System.out.println(" Breed Status : " +breedCountStatus+ "\n Breed Price("+breedCount+") :" + priceWithGst +" Rs/-" );
			
			
			System.out.println("\nYour new friend will reach you within 5 working days....\nThank You.....");
			
			System.out.println("\n.............Remaining Stocks.............\n");
			
			breedTypes.breedStatus();
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
		
		
		
	}

}
