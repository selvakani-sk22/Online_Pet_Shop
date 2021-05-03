package in.selv2619;

import static org.junit.Assert.*;

import org.junit.Test;

public class priceCalculationTest {

	@Test
	public void test() {
		
		
		double price=2*35000;
		double gst=(price*7)/100;
		double priceWithGst=price+gst;
		double amount=priceCalculation.breedPriceCalculation(2, 35000);
		assertSame(amount,priceWithGst);
	}

}
