/**
 * 
 */
package in.selv2619;

/**
 * @author selv2619
 *
 */
public class priceCalculation {
	
	public static double breedPriceCalculation(int breedCount,int breedPrice)
	{
		
		double price=breedCount*breedPrice;
		double gst=(price*7)/100;
		double priceWithGst=price+gst;
		
		return priceWithGst;
		
	}

}
