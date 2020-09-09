import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.GiftCard;

public class TestCardNameTest {

	public String test1 = "Silver";
	public String test2 = "Platinum";
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCardName1() {
		
		GiftCard giftCard = new GiftCard(101);
		assertEquals(test1, giftCard.getCardName());
	}
	
	@Test
	public void testCardName2() {
		GiftCard giftCard = new GiftCard(235);
		assertEquals(test2, giftCard.getCardName());
	}

}
