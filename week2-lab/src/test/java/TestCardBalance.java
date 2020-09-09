import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.GiftCard;

public class TestCardBalance {
	
	public double test1 = 25;
	public double test2 = 50;

	@Before
	public void setUp() throws Exception {
		
		
	}
	@Test
	public void testCardBalance1() {
		GiftCard giftCard = new GiftCard(65.99);
		assertEquals(test1, giftCard.getCardBalance(), 1);
	}

	
	@Test
	public void testCardBalance2() {
		GiftCard giftCard = new GiftCard(234.56);
		assertEquals(test2, giftCard.getCardBalance(), 1);
	}
}
