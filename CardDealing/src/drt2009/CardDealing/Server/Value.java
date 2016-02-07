package drt2009.CardDealing.Server;

/**
 * An Enum that will hold the Value object for the 13 Cards of a deck of cards
 * 
 * @author drt2009
 *
 */
public enum Value {
	Ace("Ace"),
	Two("Two"),
	Three("Three"),
	Four("Four"),
	Five("Five"),
	Six("Six"),
	Seven("Seven"),
	Eight("Eight"),
	Nine("Nine"),
	Ten("Ten"),
	Jack("Jack"),
	Queen("Queen"),
	King("King");
	
	private String value;
	
	private Value(String value){
		this.value = value;
	}
	
	/**
	 * Returns the string of the Value
	 * 
	 * @return value
	 */
	public String getValue(){
		return this.value;
	}
}
