
package in.selv2619;

/**
 * @author selv2619
 *
 */
public class PriceCalculation {
	
	/**
	 * This method used to calculate the total price with GST and count
	 * @param breedCount
	 * @param userSelectedBreedType
	 * @return
	 */
	
	public static double breedPriceCalculation(int breedCount,String userSelectedBreedType)
	{
		
		int breedPrice=BreedTypes.userSelectedBreedType(userSelectedBreedType);
		double price=breedCount*breedPrice;
		double gst=(price*7)/100;
		double priceWithGst=price+gst;
		return priceWithGst;
		
	}
	
	

}
