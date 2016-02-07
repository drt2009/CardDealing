package drt2009.CardDealing.Server;

/**
 * An Enum that will hold the Suit object for the four suits of a deck of cards
 * 
 * @author drt2009
 *
 */
public enum Suit {
	Hearts ("Hearts"),
	Diamonds ("Diamonds"),
	Spades ("Spades"),
	Clubs ("Clubs");
	
	private String suit;
	
	private Suit(String suit){
		this.suit = suit;
	}
	
	/**
	 * Returns the string value of the Suit Enum
	 * @return suit
	 */
	public String getSuit(){
		return suit;
	}
}
