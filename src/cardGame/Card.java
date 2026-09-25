
// Saira Davis & Jameela Ahmed
// September 24, 2026
// Blackjack Card Game
// Create Card objects and uses them in a simple card game 

package cardGame;

import java.util.Objects;

public class Card {
	// private data variables 
	private String cardSuit; // This represent heart, diamonds, club, and spade
	private String cardName; // This represents card name like ace, king, etc. 
	private int cardValue; // This represents numeric value of the card
	private String cardPicture; // This is the filename that has the card images
	
	//Constructor
	public Card(String cardSuit, String cardName, int cardValue, String cardPicture) {
		super();
		this.cardSuit = cardSuit;
		this.cardName = cardName;
		this.cardValue = cardValue;
		this.cardPicture = cardPicture;
	}
	
	//Getters and Setters 
	public String getCardSuit() {
		return cardSuit;
	}

	public void setCardSuit(String cardSuit) {
		this.cardSuit = cardSuit;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public int getCardValue() {
		return cardValue;
	}

	public void setCardValue(int cardValue) {
		this.cardValue = cardValue;
	}

	public String getCardPicture() {
		return cardPicture;
	}

	public void setCardPicture(String cardPicture) {
		this.cardPicture = cardPicture;
	}
	
	
	// toString() method
	@Override
	public String toString() {
		return "Card [cardSuit=" + cardSuit + ", cardName=" + cardName + ", cardValue=" + cardValue + ", cardPicture="
				+ cardPicture + "]";
	}

	// toString() equals method 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return Objects.equals(cardName, other.cardName) && cardValue == other.cardValue;
		// Only compares carName and cardValue; example - if values equals each other - return true 
	}
	
	public boolean isFaceCard() {	
		return getCardName().equals("queen")
				|| getCardName().equals("jack")
				|| getCardName().equals("king");
	}
}

