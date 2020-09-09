package model;

public class GiftCardTester {

	public static void main(String[] args) {
		GiftCard giftCard = new GiftCard(65.99);
		
		GiftCard giftC = new GiftCard(254.54);
		
		System.out.println(giftC.getCardBalance());

	}

}
