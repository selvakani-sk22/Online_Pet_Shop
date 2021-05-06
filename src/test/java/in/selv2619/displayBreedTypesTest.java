package in.selv2619;

import org.junit.Test;

public class DisplayBreedTypesTest {

	/**
	 * Display all available breeds
	 */
	@Test
	public void dislayBreedTypeTest() {
		
		BreedTypes.addBreedType();
		BreedTypes.displayBreedTypes();
		
	}

}
