package drt2009.CardDealing.Service;

import drt2009.CardDealing.Server.Suit;
import drt2009.CardDealing.Server.Value;

/**
 * Interface to the Card Object for a standard card
 * @author drt2009
 *
 */
public interface Card {
	/**
	 * Returns the String value of the suit of the card
	 * @return String suit
	 */
	public String getSuitAsString();
	/**
	 * Returns the String value of the value of the card
	 * @return String value
	 */
	public String getValueAsString();
	/**
	 * Returns the Suit object of the card
	 * @return Suit
	 */
	public Suit getSuit();
	/**
	 * Returns the Value object of the card
	 * @return Value
	 */
	public Value getValue();
}
