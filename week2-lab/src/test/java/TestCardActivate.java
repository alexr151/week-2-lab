import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.GiftCard;

public class TestCardActivate {

	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testActivateTrue() {
		GiftCard giftCard = new GiftCard(65.45);
		assertTrue(giftCard.getActivate());
	}
	
	@Test
	public void testActivateFalse() {
		GiftCard giftCard = new GiftCard(23.34);
		assertFalse(giftCard.getActivate());
	}

}
