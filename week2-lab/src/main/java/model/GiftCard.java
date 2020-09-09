package model;

public class GiftCard {
	
	private double total;
	private double cardBalance;
	private String cardName;
	private boolean activate = false;
	
	public GiftCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public GiftCard(double total) {
		super();
		this.total = total;
		
		if (this.total < 100 && this.total > 49) {
		this.cardBalance = 25;
		this.cardName = "Bronze";
		} else if (this.total < 149) {
			this.cardBalance = 30;
			this.cardName = "Silver";
		} else if (this.total < 199) {
			this.cardBalance = 40;
			this.cardName = "Gold";
		} else {
			this.cardBalance = 50;
			this.cardName = "Platinum";
		}
		
		if (this.total > 49) {
			this.activate = true;
		}
		
	}

	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getCardBalance() {
		return cardBalance;
	}
	public void setCardBalance(double cardBalance) {
		this.cardBalance = cardBalance;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	public boolean getActivate() {
		return activate;
	}

	public void setActivate(boolean activate) {
		this.activate = activate;
	}
	
}
