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
public class BreedTypes {
	
	/**
	 * Hash Map to store breed type with its price
	 */
	
	static HashMap<String, Integer> breedType = new HashMap<String,Integer>();
	
	/**
	 * Set the breed count initially
	 */
	
	static int breedPugCount=5;
	static int breedShitzuCount=7;
	static int breedDobermanCount=4;
	static int breedPomerianCount=10;
	static int breedGoldenRetrieverCount=5;
	static int breedGermanSepherdCount=8;
	
	
	/**
	 * Method to add Breed Types in list
	 */
	
	public static void addBreedType() 
	{
		
		breedType.put("Pug", 20000);
		breedType.put("Shitzu",35000);
		breedType.put("Doberman",17000);
		breedType.put("Pomerian", 10000);
		breedType.put("Golden Retriever", 25000);
		breedType.put("German Sepherd", 15000);
		
	}
	
	/**
	 * Method to display all available breed types
	 */
	
	
	public static void displayBreedTypes()
	{
		
		System.out.println("****** Breed Types In Pets Paw ****** ");
		Set<String> keys = breedType.keySet();
		for (String key : keys) {
			System.out.println(key);
		}
		System.out.println("*************************************");
		
	}
	
	
	/**
	 * Method to get the breed Price for single dog
	 * @param userSelectedBreedType
	 * @return
	 */
	
	
	public static int userSelectedBreedType(String userSelectedBreedType) 
	{
		int price=breedType.get(userSelectedBreedType);
		return price;
	}
	
	
	/**
	 * Method to get the selected breed status(available/not)
	 * @param userSelectedBreedType
	 * @param breedCount
	 * @return
	 */
	
	
	public static String breedCountStatus(String userSelectedBreedType,int breedCount)
	{
		String breedCountStatus="notAvailable";
		
		 /**
		  *  For BreedType Pug
		  */
		
		if(userSelectedBreedType.equalsIgnoreCase("pug"))              
		{
			if(breedPugCount!=0 && breedCount <= breedPugCount)
			{
				breedCountStatus="available";
				breedPugCount=breedPugCount-breedCount;
			}
		}
		
		/*8
		 *  For Breed Type Shitzu
		 */
		
		if(userSelectedBreedType.equalsIgnoreCase("shitzu"))              
		{
			
			if(breedShitzuCount!=0 && breedCount <= breedShitzuCount)
			{
				breedCountStatus="available";
				breedShitzuCount=breedShitzuCount-breedCount;
			}
		}
		
		/**
		 * For Breed Type Doberman
		 */
		
		if(userSelectedBreedType.equalsIgnoreCase("doBerMaN"))            
		{
			
			if(breedDobermanCount!=0 && breedCount <= breedDobermanCount)
			{
				breedCountStatus="available";
				breedDobermanCount=breedDobermanCount-breedCount;
			}
		}
		
		/**
		 * For Breed Type Pomerian
		 */
		
		if(userSelectedBreedType.equalsIgnoreCase("PomerIan"))          
		{
			
			if(breedPomerianCount!=0 && breedCount <=breedPomerianCount)
			{
				breedCountStatus="available";
				breedPomerianCount=breedPomerianCount-breedCount;
			}
		}
		
		/**
		 * For Breed Type Golden Retriever
		 */
		
		if(userSelectedBreedType.equalsIgnoreCase("goLDen RetriEVeR"))         
		{
			
			if(breedGoldenRetrieverCount!=0 && breedCount <= breedGoldenRetrieverCount)
			{
				breedCountStatus="available";
				breedGoldenRetrieverCount=breedGoldenRetrieverCount-breedCount;
			}
		}
		
		
		/**
		 * For Breed Type German Sepherd
		 */
		
		if(userSelectedBreedType.equalsIgnoreCase("gErMAn sepHErD"))         
		{
			
			if(breedGermanSepherdCount!=0)
			{
				breedCountStatus="available";
				breedGermanSepherdCount=breedGermanSepherdCount-breedCount;
			}
		}
		
		return breedCountStatus;
	}
		
	
	/**
	 * Method to display available breed counts after placing order
	 */
	
	
	public static void breedStatus() 
	{
		
		System.out.println("Available Pug : " +breedPugCount);
		System.out.println("Available Shitzu : " +breedShitzuCount);
		System.out.println("Available Doberman : " +breedDobermanCount);
		System.out.println("Available Pomerian : " +breedPomerianCount);
		System.out.println("Available Golden Retreiver : " +breedGoldenRetrieverCount);
		System.out.println("Available German Sepherd : " +breedGermanSepherdCount);

	}
	
}
