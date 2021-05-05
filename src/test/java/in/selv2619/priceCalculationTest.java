package in.selv2619;

import static org.junit.Assert.*;

import org.junit.Test;

public class PriceCalculationTest {

	/*
	 * This method is used to calculate the price of the selected breed with count
	 */
	
	@Test
	public void PriceCalculationTest() 
	{
		
		BreedTypes.addBreedType();		
		double amount=PriceCalculation.breedPriceCalculation(2, "Shitzu");
		assertEquals(74900.00,amount,0.001);
		
	}

}
