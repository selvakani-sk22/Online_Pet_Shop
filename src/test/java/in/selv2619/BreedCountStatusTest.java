package in.selv2619;

import static org.junit.Assert.*;

import org.junit.Test;

public class BreedCountStatusTest {

	/*
	 * Test with available breed count
	 */
	
	@Test
	
	public void availableCount() 
	{
		BreedTypes.addBreedType();
		String breedStatus=BreedTypes.breedCountStatus("Shitzu", 2);
		assertEquals("available",breedStatus);

	}
	
	/*
	 * Test with unavailable breed count
	 */
	
	@Test
	
	public void unAvailableCount() 
	{
		BreedTypes.addBreedType();
		String breedStatus=BreedTypes.breedCountStatus("Shitzu", 10);
		assertEquals("notAvailable",breedStatus);

	}
	
	

}
